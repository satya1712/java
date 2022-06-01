public class Prime 
{
    public static void main(String[] args) {
        int i,count=0,n=5;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            count++;
        }
        if(count==2)
        {
            System.out.println("It is a prime number");
        }
        else
        {
            System.out.println("It is not a prime number");
        }
    }
    
}
