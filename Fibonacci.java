public class Fibonacci {
    public static void main(String[] args) {
        int a=0,b=1,c,n=5,i;
        for(i=0;i<=n;i++)
        {
            System.out.print(" "+a);
            a=a+b;
            c=a;
            a=b;
            b=c;
        }
    }
    
}
