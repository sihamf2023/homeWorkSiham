package december25HomeWork;
import java.sql.SQLOutput;
public class question9 {
    int r;
    question9(int r) {
        this.r = r;
    }
}
class DVD extends question9 {
    int c;
    DVD(int r, int c) {
        super (r);
        this.c = c;
        System.out.println(r + " " + c);

    }
    public static void main(String[] args) {
        DVD dvd = new DVD(10,20);
    }

    //Output ===> C)super (r);
     //this.c = c;



}
