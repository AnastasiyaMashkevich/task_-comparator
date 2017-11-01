import java.util.*;

/**
 * Created by anastasiya_mashkevic on 10/26/17.
 */
public class Helper {

	public static void updateString(List<String> list) {
		for (int i = 1; i < list.size() - 1; i = i + 2) {
			list.set(i, updateLastAndFirst(list.get(i)));
		}
	}

	public static String updateLastAndFirst(String value) {
		char[] arr = value.toCharArray();
		char temp = arr[0];
		arr[0] = arr[arr.length - 1];
		arr[arr.length - 1] = temp;
		return String.valueOf(arr);
	}

	public static List<String> revertString(List<String> list) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			String s1 = builder.append(list.get(i)).reverse().toString();
			builder.setLength(0);
			list.set(i, s1);
		}
		return list;
	}
}



