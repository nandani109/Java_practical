package prac13;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for which you want the Multiplicaton Table: ");
        int a = sc.nextInt();
        System.out.println("\n");
        for (int i=0;i<=10;i++){
            int b=a*i;
            System.out.println(a +" X "+ i +" = " + b);
        }

    }
}
