
public class Power {

	private static int f(int num, int power) {
		if (power == 0) {
			return 1;
		} else {
			return num * f(num, --power);
		}
	}

	public static void main(String[] args) {
		System.out.print(f(3, 3));
	}

}
