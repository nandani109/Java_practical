package prac15;
import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int a = sc.nextInt();
        int b = 1;
        for (int i = 0;i <= a;i++){
            for (int j = 0;j < i;j++){
                System.out.print(b + " ");
                b++;
            }
            System.out.print("\n");
        }
    }
}