package december29HomeWork;

public class question12 {
    public static void doSum (Integer x, Integer y)
    {

        System. out . println ("Integer sum is " + (x + y) );

    }
    public static void doSum (double x, double y)
    {
        System. out . println ("double sum is " + (x + y) ) ;
    }
    public static void doSum (float x, float y)
    {
        System. out . println ("float sum is " + (x + y) ) ;
    }
    public static void doSum (int x, int y)
    {
        System. out . println ("int sum is " + (x + y) ) ;
    }
    public static void main (String [ ] args)
    {
        doSum (10, 20) ;
        doSum (10.0, 20.0) ;
    } //Output ===> B) int sum is 30
    //       double sum is 30.0
}
