package Arrays;

import java.util.List;

public class Maxsum {
	// DO NOT MODFIY THE LIST.
	public int maxSubArray(final List<Integer> array) {
		if (array == null || array.size() == 0)
			return 0;
		int max_so_far = 0;
		int max_ending_here = 0;
		int index = 0;
		max_so_far = max_ending_here = array.get(index++);
		while (index < array.size()) {
			int el = array.get(index);
			max_ending_here = el > max_ending_here + el ? el : max_ending_here + el;
			max_so_far = max_so_far > max_ending_here ? max_so_far : max_ending_here;
			index++;
		}
		return max_so_far;
	}
}
