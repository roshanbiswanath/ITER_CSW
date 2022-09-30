import java.util.Scanner;
public class fibSum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N: ");
		int n = sc.nextInt();
		int c;
		System.out.print("Series: ");
		for(int i = 0; i<n;i++) {
			c = a+b;
			System.out.print(a+" ");
			sum+=a;
			a = b;
			b = c;
			c = a + b;
			a=b;
			b=c;
		}
		System.out.println();
		System.out.println("Sum: "+sum);
	}

}
