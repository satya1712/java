public class BinarytoDecimal {
    public static void main(String[] args) {
        int num=1010;
        int rem;
        double decimal=0;
        int n=0;
        while(num>0)
        {
            rem=num%10;
            decimal =decimal+(rem*Math.pow(2,n));
            num=num/10;
            n++;
        }
        System.out.println(decimal);
    }
    
}
