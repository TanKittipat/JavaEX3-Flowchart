import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner Ex4 = new Scanner(System.in);
        System.out.print("Enter radius : ");
        float r = Ex4.nextFloat();
        double area = (r * r) * 3.14;
        System.out.println("Area of circle is " + area);
    }
}
