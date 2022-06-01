public class Box {
    int height;
    int width;
    int depth;
    //construct
    Box()
    {
        System.out.println("I am a constructor");
    }
    //constructor overloading
    Box(int h,int w,int d)
    {
        height=h;
        width=w;
        depth=d;
    }

}
