package prac14;
import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int a = sc.nextInt();
        for (int i = 0;i <= a;i++){
            for (int j = 0;j < i;j++){
                System.out.print(i + " ");
            }
            System.out.print("\n");
        }
    }
}
