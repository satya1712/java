public class PerfectNum {
    public static void main(String[] args) {
        int n=5,sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(n==sum)
        {
            System.out.println("It is a perfect number");
        }
        else{
            System.out.println("It is not a perfect number");
        }
    }
    
}
