
public class SumBetween {

	// Verilen sayıya kadar olan sayıların toplamı

	private static int f(int num) {
		if (num == 0) {
			return 0;
		} else {
			return num + f(--num);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(f(10));
	}

}
