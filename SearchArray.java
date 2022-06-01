public class SearchArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9};
        int n=9,key=4;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==key)
            {
                count++;
                break;
            }
        }
        if(count==1)
        {
            System.out.print("Element found");
        }
        else{
            System.out.print("Element not found");
        }
    }
    
}
