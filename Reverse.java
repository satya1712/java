public class Reverse {
    public static void main(String[] args) {
        int n=125,sum=0,rem;
        while(n>0)
        {
            rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        System.out.println(sum);
    }
    
}
