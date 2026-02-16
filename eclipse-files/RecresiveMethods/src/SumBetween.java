
public class SumBetween {

	private static int f(int num) {
		if (num == 0) {
			return 0;
		} else {
			return num + f(--num);
		}
	}

	public static void main(String[] args) {
		System.out.print(f(10));
	}
	
}
