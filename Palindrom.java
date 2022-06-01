public class Palindrom {
    public static void main(String[] args) {
        int n=121,sum=0,rem,temp;
        temp=n;
        while(n>0)
        {
            rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.print("it is a palindrome number");
        }
        else{
            System.out.println("it is not a palindrome number");
        }
    }
    
}
