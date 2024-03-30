package prac23;
import java.util.Scanner;
public class P23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int aa = input.nextInt();
        int a = aa;                
        System.out.print("Factorial of "+a+" is: ");
        while(aa != 2){
            a*=aa-1;
            aa--;
        }
        System.out.println(a);
    }
}
