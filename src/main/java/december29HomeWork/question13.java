package december29HomeWork;

public class question13 {
    int x;
    question13 (){
        this(10); //line 1
    }
    question13(int x){
        this.x=x;
    }
}
class Car2 extends question13{
    int y;
    Car2(){
        super(10);  //line 2
    }
    Car2(int y){
        super (y);
        this.y=y;
    }
    public String toString(){
        return super.x+ ":"+this.y;
    }

    public static void main(String[] args) {
        question13 y = new Car2(20);
        System.out.println(y);
    } //Output ===> C)20:20
}
