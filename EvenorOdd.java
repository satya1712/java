import java.util.Scanner;
public class EvenorOdd {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a value:");
        int a = obj.nextInt();
        if(a%2==0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("odd number");
        }
        
    }
    
}
