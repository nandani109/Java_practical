package prac2;
import java.util.Scanner;


public class arithmetic {
	public static void main(String[] args) {
		System.out.println("Enter the value of a: ");
		Scanner scan1 = new Scanner(System.in);
		int a = scan1.nextInt();
		
		System.out.println("Enter the value of b: ");
		int b = scan1.nextInt();
		int add = a+b;
		int sub = a-b;
		int multiply = a*b;
		int divide = a/b;
		int modulus=a%b;
		System.out.println("a+b="+ add);
		System.out.println("a-b="+ sub);
		System.out.println("a*b="+ multiply);
		System.out.println("a/b="+ divide);
		System.out.println("a%b="+ modulus);
		
		scan1.close();
	}

}
