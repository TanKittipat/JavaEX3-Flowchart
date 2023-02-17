import java.util.Scanner;

/**
 * Ex1
 */
public class Ex1 {
    public static void main(String[] args) {
        Scanner Ex1 = new Scanner(System.in);
        System.out.print("Enter x1 : ");
        float x1 = Ex1.nextFloat();
        System.out.print("Enter x2 : ");
        float x2 = Ex1.nextFloat();
        System.out.print("Enter x3 : ");
        float x3 = Ex1.nextFloat();
        System.out.print("Enter x4 : ");
        float x4 = Ex1.nextFloat();
        System.out.print("Enter x5 : ");
        float x5 = Ex1.nextFloat();
        float sum = x1 + x2 + x3 + x4 + x5;
        float average = sum / 5;
        System.out.println("Average = " + average);
        if (average >= 50) {
            System.out.println("Pass !!!");
        } else {
            System.out.println("Fail !!!");
        }

    }

}