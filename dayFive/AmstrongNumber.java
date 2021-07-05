package dayFive;

// Input : 153
// 153 is an Armstrong number.
// 1*1*1 + 5*5*5 + 3*3*3 = 153

public class AmstrongNumber {

	int power(int x, long y) {
		if (y == 0)
			return 1;

		if (y % 2 == 0)
			return power(x, y / 2) * power(x, y / 2);

		return x * power(x, y / 2) * power(x, y / 2);
	}

	int order(int x) {
		int n = 0;
		while (x != 0) {
			n++;
			x = x / 10;
		}
		return n;
	}

	public boolean isAmstrong(int x) {
		int n = order(x);
		int temp = x, sum = 0;
		while (temp != 0) {
			int r = temp % 10;
			sum = sum + power(r, n);
			temp = temp / 10;
		}
		return (sum == x);
	}

	public static void main(String[] args) {
		AmstrongNumber amst = new AmstrongNumber();
		System.out.println(amst.isAmstrong(153));
	}
}
