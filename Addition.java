import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter a value");
        int num1 = a.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.println("Enter b value");
        int num2 = b.nextInt();
        System.out.println("Addition of two numbers");
        System.out.print(num1+num2);
    }
    
}
