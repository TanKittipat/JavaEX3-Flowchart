import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner Ex9 = new Scanner(System.in);
        System.out.print("Enter X : ");
        int x = Ex9.nextInt();
        if (x == 0) {
            System.out.println("X is zero");
        } else if (x > 0) {
            System.out.println("X is positive");
        } else {
            System.out.println("X is negative");
        }
    }
}
