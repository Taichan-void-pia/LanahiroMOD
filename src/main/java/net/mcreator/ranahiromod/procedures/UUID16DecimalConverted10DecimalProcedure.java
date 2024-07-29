package net.mcreator.ranahiromod.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.entity.Entity;

public class UUID16DecimalConverted10DecimalProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double decimal_longer = 0;
		double cnt = 0;
		double coverted_decimal_ten = 0;
		double output_decimal = 0;
		String sixteen_decimal = "";
		String trim_text_calculate = "";
		String output_decimal_text = "";
		sixteen_decimal = entity.getPersistentData().getString("decimal_16");
		decimal_longer = (sixteen_decimal).length();
		for (int index0 = 0; index0 < (int) decimal_longer; index0++) {
			trim_text_calculate = sixteen_decimal.substring((int) ((decimal_longer - cnt) - 1), (int) (decimal_longer - cnt));
			if ((trim_text_calculate).equals("a") || (trim_text_calculate).equals("A")) {
				coverted_decimal_ten = 10 * Math.pow(16, cnt);
			} else if ((trim_text_calculate).equals("b") || (trim_text_calculate).equals("B")) {
				coverted_decimal_ten = 11 * Math.pow(16, cnt);
			} else if ((trim_text_calculate).equals("c") || (trim_text_calculate).equals("C")) {
				coverted_decimal_ten = 12 * Math.pow(16, cnt);
			} else if ((trim_text_calculate).equals("d") || (trim_text_calculate).equals("D")) {
				coverted_decimal_ten = 13 * Math.pow(16, cnt);
			} else if ((trim_text_calculate).equals("e") || (trim_text_calculate).equals("E")) {
				coverted_decimal_ten = 14 * Math.pow(16, cnt);
			} else if ((trim_text_calculate).equals("f") || (trim_text_calculate).equals("F")) {
				coverted_decimal_ten = 15 * Math.pow(16, cnt);
			} else if ((trim_text_calculate).equals("-")) {
				coverted_decimal_ten = 0;
			} else {
				coverted_decimal_ten = new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(trim_text_calculate) * Math.pow(16, cnt);
			}
			output_decimal = output_decimal + coverted_decimal_ten;
			cnt = cnt + 1;
		}
		output_decimal_text = "" + Math.round(output_decimal);
		entity.getPersistentData().putDouble("decimal_10", output_decimal);
		entity.getPersistentData().putString("decimal_10_text", output_decimal_text);
	}
}
