#version 150

#moj_import <taichan_cot/utils.glsl>
#moj_import <taichan_cot/config.glsl>

#moj_import <fog.glsl>

uniform vec4 ColorModulator;
uniform float FogStart;
uniform float FogEnd;
uniform vec4 FogColor;

in float vertexDistance;
in vec4 vertexColor;

/* -- added for custom outlines -- */
uniform mat4 ModelViewMat;
uniform float GameTime;

flat in int CustomOutlinesLineType;
in float CustomOutlinesGradient;
in vec3 vertexPos;
in vec4 pos1, pos2;
flat in vec4 pos3;
/* -- -- */

out vec4 fragColor;

void main() {
  vec4 color = vertexColor * ColorModulator;

  vec3 pos = pos3.w == 0 ? pos1.xyz / pos1.w : pos2.xyz / pos2.w;
  float lineLength = round(length(pos - pos3.xyz) * 0x1000) / 0x1000;

  float fragDistance = spherical_distance(ModelViewMat, vertexPos);
  vec4 gradient = color;

  // block selection
  if (CustomOutlinesLineType == 1){
    if(block_COLOURS.length() <= 1){
      gradient = block_COLOURS[0];
    }
    else{
      float gradientrender_GRADIENT_MIX = block_ANIMATE_ALONG_LINES ? CustomOutlinesGradient * lineLength * 2.0 : fragDistance;
      gradientrender_GRADIENT_MIX /= 2.;
      float gradientrender_GRADIENT_ANIM = fract( ( ( block_ANIMATE_ALONG_LINES ? gradientrender_GRADIENT_MIX : gradientrender_GRADIENT_MIX * int(block_ANIMATE_WITH_DISTANCE) ) + GameTime * block_ANIM_SPEED * (-block_ANIM_DIRECTION) ) / block_COLOUR_PERIOD );
      
      float len = float(block_COLOURS.length());
      for(int i = 0; i < len; i++){
        float _step = float(i)/len;
        float _step2 = (float(i)+1.)/len;

        gradient = mix(
          i == 0 ? block_COLOURS[block_COLOURS.length()-1] : gradient,
          block_COLOURS[i],
          block_SMOOTH_MIX ? smoothstep(_step, _step2, gradientrender_GRADIENT_ANIM) : step(_step, gradientrender_GRADIENT_ANIM)
        );
      }
    }
  }
  
  // entity hitbox
  else if (CustomOutlinesLineType == 2){
    if(hitbox_COLOURS.length() <= 1){
      gradient = hitbox_COLOURS[0];
    }
    else{
      float gradientrender_GRADIENT_MIX = hitbox_ANIMATE_ALONG_LINES ? CustomOutlinesGradient * lineLength * 2.0 : fragDistance;
      gradientrender_GRADIENT_MIX /= 2.;
      float gradientrender_GRADIENT_ANIM = fract( ( ( hitbox_ANIMATE_ALONG_LINES ? gradientrender_GRADIENT_MIX : gradientrender_GRADIENT_MIX * int(hitbox_ANIMATE_WITH_DISTANCE) ) + GameTime * hitbox_ANIM_SPEED * (-hitbox_ANIM_DIRECTION) ) / hitbox_COLOUR_PERIOD );
      
      float len = float(hitbox_COLOURS.length());
      for(int i = 0; i < len; i++){
        float _step = float(i)/len;
        float _step2 = (float(i)+1.)/len;

        gradient = mix(
          i == 0 ? hitbox_COLOURS[hitbox_COLOURS.length()-1] : gradient,
          hitbox_COLOURS[i],
          hitbox_SMOOTH_MIX ? smoothstep(_step, _step2, gradientrender_GRADIENT_ANIM) : step(_step, gradientrender_GRADIENT_ANIM)
        );
      }
    }
  }
  
  if(gradient.a < 0.05) {
    discard;
  }
  color = gradient;

  fragColor = linear_fog(color, vertexDistance, FogStart, FogEnd, FogColor);
}