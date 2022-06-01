public class SumofEvenOdd {
    public static void main(String[] args) {
       int i;
       int sum=0,n=5,result=0;
       for(i=0;i<=n;i++)
       {
           if(i%2==0)
           {
               sum=sum+i;
           }
       }
       System.out.println("Sum of Even numbers"+sum);
       for(int j=1;j<=n;j++)
       {
           if(j%2!=0)
           {
               result=result+j;
           }
       }
       System.out.println("Sum of Odd Numbers"+result);
    }
    
}
