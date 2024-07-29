#version 150

#moj_import <taichan_cot/utils.glsl>
#moj_import <taichan_cot/config.glsl>

in vec3 Position;
in vec4 Color;
in vec3 Normal;

uniform mat4 ModelViewMat;
uniform mat4 ProjMat;
uniform float LineWidth;
uniform vec2 ScreenSize;
uniform int FogShape;

out float vertexDistance;
out vec4 vertexColor;

/* -- modified for custom outlines -- */
uniform float GameTime;

flat out int CustomOutlinesLineType;
out float CustomOutlinesGradient;
out vec3 vertexPos;
/* -- -- */

const float VIEW_SHRINK = 1.0 - (1.0 / 256.0);
const mat4 VIEW_SCALE = mat4(
    VIEW_SHRINK, 0.0, 0.0, 0.0,
    0.0, VIEW_SHRINK, 0.0, 0.0,
    0.0, 0.0, VIEW_SHRINK, 0.0,
    0.0, 0.0, 0.0, 1.0
);

out vec4 pos1, pos2;
flat out vec4 pos3;

void main() {
  /* -- modified for custom outlines -- */
  vertexDistance = spherical_distance(ModelViewMat, Position);
  vertexPos = Position;
  int id = gl_VertexID % 4;
  /* -- -- */

  vec4 linePosStart = ProjMat * VIEW_SCALE * ModelViewMat * vec4(Position, 1.0);
  vec4 linePosEnd = ProjMat * VIEW_SCALE * ModelViewMat * vec4(Position + Normal, 1.0);

  vec3 ndc1 = linePosStart.xyz / linePosStart.w;
  vec3 ndc2 = linePosEnd.xyz / linePosEnd.w;

  vec2 lineScreenDirection = normalize((ndc2.xy - ndc1.xy) * ScreenSize);

  /* -- modified for custom outlines -- */
  float lineWidthMultiplier = 1.0;
  CustomOutlinesLineType = 0;
  if( rougheq( Color, vec4(0., 0., 0., 0.4) ) ) {
    // block selection outline
    lineWidthMultiplier = vertexDistance > 7 ? 1.0 : block_LINE_THICKNESS;
    CustomOutlinesLineType = 1;
  }
  else if( 
    rougheq( Color, vec4(1.) ) || // white lines
    ( hitbox_APPLY_TO_ALL_LINES && rougheq( Color, vec4(1.,0.,0.,1.) ) ) || // red lines
    ( hitbox_APPLY_TO_ALL_LINES && rougheq( Color, vec4(0.,0.,1.,1.) ) ) || // blue lines
    ( hitbox_APPLY_TO_ALL_LINES && rougheq( Color, vec4(1.,1.,0.,1.) ) ) // yellow lines
  ) {
    // entity hitbox (+ other white lines)
    lineWidthMultiplier = vertexDistance > 7 ? 1.0 : hitbox_LINE_THICKNESS;
    CustomOutlinesLineType = 2;
  }
  vec2 lineOffset = vec2(-lineScreenDirection.y, lineScreenDirection.x) * LineWidth * lineWidthMultiplier / ScreenSize;

  if(block_ANIMATE_ALONG_LINES || hitbox_ANIMATE_ALONG_LINES){
    CustomOutlinesGradient = float(id == 0 || id == 1);
  }
  /* -- -- */

  if (lineOffset.x < 0.0) {
    lineOffset *= -1.0;
  }

  /* -- modified for custom outlines -- */
  if (gl_VertexID % 2 == 0) {
    vertexPos = (ndc1 + vec3(lineOffset, 0.0)) * linePosStart.w;
    gl_Position = vec4(vertexPos, linePosStart.w);
  } else {
    vertexPos = (ndc1 - vec3(lineOffset, 0.0)) * linePosStart.w;
    gl_Position = vec4(vertexPos, linePosStart.w);
  }

  vertexColor = Color;

  // for line length calculations, credits: https://github.com/DartCat25
  pos1 = pos2 = vec4(0);
  pos3 = vec4(Position, id == 1);
  if (id == 0) pos1 = vec4(Position, 1);
  if (id == 2) pos2 = vec4(Position, 1);
  /* -- -- */
}