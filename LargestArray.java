public class LargestArray {
    public static void main(String[] args) {
        int[] a;
        a = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;
           
        int Max=a[0];
        for(int i=0;i<=4;i++)
        {
            if(a[i]>Max)
            {
                Max=a[i];
            }
        }
        System.out.println(Max);
    }
    
}
