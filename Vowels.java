public class Vowels {
    public static void main(String[] args) {
        String str ="abcdefghi";
        int len=str.length();
        for(int i=len-1;i>=0;i--)
        {
            switch(str.charAt(i))
            {
                case 'a' : System.out.println("a");
                           break;
                case 'e' : System.out.println("e");
                           break;
                case 'i' : System.out.println("i");
                           break;
                case 'o' : System.out.println("i");
                           break;
                case 'u' : System.out.println("i");
                           break;
               default : System.out.println("Consonants");


            }
        }
    }
    
}
