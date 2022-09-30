import java.util.Scanner;
import java.math.BigInteger;

public class fact {
	public static BigInteger fact(BigInteger a) {
		if (a == BigInteger.valueOf(0)) {
			return BigInteger.valueOf(1);
		}
		return a.multiply( fact(a.subtract(BigInteger.valueOf(1))));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N: ");
		int y = sc.nextInt();
		BigInteger x = BigInteger.valueOf(y);
		System.out.print(x+"!: ");
		System.out.println(fact(x));
	}

}
