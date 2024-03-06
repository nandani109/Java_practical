
public class g12 {

}
import java.util.Scanner;

public class g12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int a = scan.nextInt();
		
		System.out.println("Enter the second number: ");
		int b = scan.nextInt();
		System.out.println("Enter the third number: ");
		int c = scan.nextInt();
		
        
        int min = a;
        if (b < min) {
            min = b;
        }
 
        if (c < min) {
            min = c;
        }
 
        
 
        
        System.out.println("Lowest value :" + min);
        
        
        
        
		scan.close();	
			
		}

	}