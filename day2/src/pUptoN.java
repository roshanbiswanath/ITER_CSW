import java.util.Scanner;
public class pUptoN {
	public static boolean isPrime(int a) {
		if (a ==1) {return false;}
		for (int i = 2;i<=a/2;i++) {
			if (a%i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N: ");
		int n = sc.nextInt();
		if (n<2) {
			System.out.println("N should start from 2");
		}
		else {
			for(int i = 2; i<=n;i++) {
				if (isPrime(i)) {
					System.out.print(i+" ");
				}
			}
		}
	}

}
