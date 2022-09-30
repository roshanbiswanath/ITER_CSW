import java.util.Scanner;
import java.lang.Math;
public class armUptoN {
	public static int fPow(int a, int b) {
		if (b ==0) {return a;}
		int product = 1;
		for(int i = 0;i<b;i++) {
			product *= a;
		}
		return product;
	}
	public static boolean isArm(int a) {
		int sum = 0;
		int count = 0;
		int n = a;
		while (n>0) {
			count += 1;
			n = n/10;
		}
		n = a;
		while (n>0) {
			sum +=  fPow(n%10, count);
			n = n/10;
		}
		//System.out.println(sum);
		//System.out.println(count);
		return (sum == a)?true:false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N: ");
		int n = sc.nextInt();
		for(int i = 1;i<=n;i++) {
			if(isArm(i)) {
				System.out.print(i+" ");
			}
		}
	}

}
