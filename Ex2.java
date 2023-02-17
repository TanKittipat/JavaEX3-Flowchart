import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner Ex2 = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = Ex2.nextInt();
        int sum = 0;
        float sum1 = sum;
        do {
            System.out.print("Enter price : ");
            float x = Ex2.nextFloat();
            sum1 = sum1 + x;
            n = n - 1;
        } while (n > 0);
        System.out.println(sum1);

    }
}
