import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner Ex3 = new Scanner(System.in);
        System.out.print("Enter quantity : ");
        int n = Ex3.nextInt();
        System.out.print("Enter price : ");
        float x = Ex3.nextFloat();
        float result = n * x;
        System.out.println("Total price is " + result);
    }
}
