import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner Ex7 = new Scanner(System.in);
        System.out.print("Enter A : ");
        int a = Ex7.nextInt();
        System.out.print("Enter B : ");
        int b = Ex7.nextInt();
        if (a == b) {
            System.out.println("A = B");
        } else if (a > b) {
            System.out.println("A is more than B");
        } else {
            System.out.println("B is more than A");
        }
    }
}
