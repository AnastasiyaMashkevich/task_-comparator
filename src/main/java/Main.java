import java.util.*;

/**
 * Created by anastasiya_mashkevic on 10/26/17.
 */
public class Main {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Autumn leaves upon the ground,");
		list.add("Yellow, brown and red,");
		list.add("Winter’s getting closer,");
		list.add("The trees are going to bed.");

		Collections.sort(list, CompareHelper.executeLengthCompare());
		Collections.sort(list, CompareHelper.executeVovLengthCompare());
		Helper.updateString(list);
		Helper.revertString(list);
	}
}
