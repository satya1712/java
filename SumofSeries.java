public class SumofSeries {
    // Java Program to Find the SumofSeries1+1/2+1/3+1/4+…….+1/N
    public static void main(String[] args) {

        for(int i=1;i<=5;i++)
        {
            System.out.print("1/"+i);
            if(i==5)
            break;
            System.out.print("+");
        }
    }

}
