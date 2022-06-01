import java.util.Scanner;
public class Subtraction {
    public static void main(String[] args) {
        System.out.println("Enter a value");
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        System.out.println("Enter b value");
        int b = obj.nextInt();
        System.out.println(a-b);
    }
}
