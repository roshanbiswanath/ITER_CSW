import java.util.Scanner;
import java.math.BigInteger;

public class factLoop {
	public static BigInteger fact(int a) {
		BigInteger f = BigInteger.valueOf(1);
		for(int i = 1;i<=a;i++) {
			f = f.multiply(BigInteger.valueOf(i));
		}
		return f;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N: ");
		int x = sc.nextInt();
		System.out.print(x+"!: ");
		System.out.println(fact(x));
	}

}
