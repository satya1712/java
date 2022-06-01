public class PrimeRange {
    public static void main(String[] args) {
        int a=1,b=5,count;
        for(int i=a;i<=b;i++)
        {
            count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0){
                   count++;
                }
            }
            if(count==2){
                System.out.println(i);
            }
            else
            {
                System.out.println("There is no prime number");
            }
        }  
    }
    
}
