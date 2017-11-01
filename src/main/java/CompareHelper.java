import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by anastasiya_mashkevic on 10/26/17.
 */
public class CompareHelper {

	private CompareHelper() {
	}

	public static Comparator<String> executeLengthCompare() {
		Comparator<String> comp = new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		};
		return comp;
	}

	public static Comparator<String> executeVovLengthCompare() {
		Comparator<String> comp = new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				return getCountOfVowels(s1) - getCountOfVowels(s2);
			}
		};
		return comp;
	}

	public static int getCountOfVowels(String s1) {
		String lowerCaseString = s1.toLowerCase();
		int vowelCount = 0;
		for (int i = 0; i < lowerCaseString.length(); ++i) {
			Character charCharacter = lowerCaseString.charAt(i);

			if (Arrays.binarySearch(ConstantHelper.VOVELS, charCharacter) >= 0) {
				vowelCount += 1;
			}
		}
		return vowelCount;
	}

	public static int countingConsonants(String s1) {
		String lowerCaseString = s1.toLowerCase();
		int vowelCount = 0;
		for (int i = 0; i < lowerCaseString.length(); ++i) {
			Character charCharacter = lowerCaseString.charAt(i);

			if (Arrays.binarySearch(ConstantHelper.CONSONANTS, charCharacter) >= 0) {
				vowelCount += 1;
			}
		}
		return vowelCount;
	}
}
