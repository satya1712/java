public class SumSquare {
    public static void main(String[] args) {
        int n=121,rem,sum=0;
        while(n>0)
        {
            rem=n%10;
            sum=sum+rem*rem;
            n=n/10;
        }
        System.out.println(sum);
    }
    
}
