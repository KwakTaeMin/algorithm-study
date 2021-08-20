package algorithm.study.leetcode;

public class TwoSum {

	public int[] twoSum(int[] input, int target) {
		for (int index = 0; index < input.length; index++) {
			int minusTargetValue = target - input[index];
			for (int search = index; search < input.length; search++) {
				if (minusTargetValue == input[search] && index != search) {
					int[] result = {index, search};
					return result;
				}
			}
		}
		return null;
	}
}
