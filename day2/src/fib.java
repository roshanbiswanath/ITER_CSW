import java.util.Scanner;
public class fib {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N: ");
		int n = sc.nextInt();
		int c;
		for(int i = 0; i<=n;i++) {
			c = a+b;
			System.out.print(a+" ");
			a = b;
			b = c;
		}
	}

}
