package algorithm.study.leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TwoSumTest {

	@Test
	void twoSumTest1() {
		TwoSum algorithm = new TwoSum();
		int[] input = {2, 7, 11, 15};
		int[] expect = {0, 1};
		assertThat(algorithm.twoSum(input, 9)).isEqualTo(expect);
	}

	@Test
	void twoSumTest2() {
		TwoSum algorithm = new TwoSum();
		int[] input = {3, 2, 4};
		int[] expect = {1, 2};
		assertThat(algorithm.twoSum(input, 6)).isEqualTo(expect);
	}

	@Test
	void twoSumTest3() {
		TwoSum algorithm = new TwoSum();
		int[] input = {3, 3};
		int[] expect = {0, 1};
		assertThat(algorithm.twoSum(input, 6)).isEqualTo(expect);
	}
}