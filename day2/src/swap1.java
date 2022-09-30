
import java.util.Scanner;

public class swap1 <T>{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c;
		a = 10;
		b = 20;
		System.out.println("Before Swap: "+a+" "+b);
		c = a;
		a = b;
		b = c;
		System.out.println("After Swap: "+a+" "+b);
		a = 10;
		b = 20;
		System.out.println("Before Swap: "+a+" "+b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		/*
		a = a * b;
		b = a / b;
		a = a / b;
		*/
		System.out.println("After Swap: "+a+" "+b);
		
	}

}
