public class Permutation {

	static void generatePermutations(String remainingChars, String currentPermutation) {

		if (remainingChars.length() == 0) {
			System.out.println("Permutation: " + currentPermutation);
			return;
		}

		for (int i = 0; i < remainingChars.length(); i++) {

			// Remove the picked character from the remaining pool
			String nextRemainingChars = remainingChars.substring(0, i) + remainingChars.substring(i + 1);

			// Add the picked character to the current permutation
			String nextPermutation = currentPermutation + remainingChars.charAt(i);

			generatePermutations(nextRemainingChars, nextPermutation);
		}
	}

	public static void main(String[] args) {
		String input = "ABC";
		generatePermutations(input, "");
	}
}