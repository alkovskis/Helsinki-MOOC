package WeekSix;

public class StringUtils {
	public static boolean included(String word, String searched) {
		if (word != null && searched != null) {
			if (word.toUpperCase().contains(searched.trim().toUpperCase())) {
				return true;
			} else
				return false;
		}
		return false;

	}
}
