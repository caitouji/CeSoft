package info.caitou.general.utils;

public class AccountUtils {
	public static String getParentSubCode(String subcode) {
		if (subcode.lastIndexOf("-") > 0) {
			return subcode.substring(0, subcode.lastIndexOf("-"));
		} else {
			return subcode;
		}
	}
}
