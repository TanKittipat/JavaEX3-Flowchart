import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner Ex6 = new Scanner(System.in);
        System.out.print("Enter x : ");
        int x = Ex6.nextInt();
        int y = (x * x) + (2 * x) + 10;
        System.out.println("The result is " + y);
    }
}
