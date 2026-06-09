package oop.recrusive;

public class SumArray {

	private static int f(int[] nums, int index) {
		if (index == nums.length) {
			return 0;
		} else {
			return nums[index] + f(nums, ++index);
		}
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5 };
		System.out.print(f(nums, 0));
	}

}
