package prac11;
import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to check: ");
        int a = sc.nextInt();

        if(a % 100 == 0){
            if (a % 400 == 0) {
                System.out.println("Its a leap Year");
            }
            else{
                System.out.println("Its not a leap Year");
            }
        }
        else if (a % 4 == 0) {
            System.out.println("Its a leap Year");            
        }
        else{
            System.out.println("Its not a leap Year");
        }
        
    }
}