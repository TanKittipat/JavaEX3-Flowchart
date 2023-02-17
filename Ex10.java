import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner Ex10 = new Scanner(System.in);
        System.out.print("Enter middle term score : ");
        float a = Ex10.nextFloat();
        System.out.print("Enter final score : ");
        float b = Ex10.nextFloat();
        float sum = a + b;
        System.out.println("Total score is " + sum);
        if (sum >= 80) {
            System.out.println("A");
        } else if (sum >= 75) {
            System.out.println("B+");
        } else if (sum >= 70) {
            System.out.println("B");
        } else if (sum >= 65) {
            System.out.println("C+");
        } else if (sum >= 60) {
            System.out.println("C");
        } else if (sum >= 55) {
            System.out.println("D+");
        } else if (sum >= 50) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }

    }
}
