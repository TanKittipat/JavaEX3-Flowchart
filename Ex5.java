import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner Ex5 = new Scanner(System.in);
        System.out.print("Enter width : ");
        float w = Ex5.nextFloat();
        System.out.print("Enter length : ");
        float l = Ex5.nextFloat();
        float area = w * l;
        System.out.println("The area of this quad is : " + area);
    }
}
