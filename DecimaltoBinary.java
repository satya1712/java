public class DecimaltoBinary {
    public static void main(String[] args) {
        int n=12;
        int rem;
        String binary;
        String result=null;
        String value=null;
        while(n!=0){
            rem = n%2;
            binary = String.valueOf(rem);
            result = result+binary;
            n=n/2;
        }
        for(int i=7;i>=4;i--)
        {
            value = value +result.charAt(i);
        }
        System.out.print(value);
    }
    
}
