package december29HomeWork;

public class question18 {
    String type ="4W";
    int maxSpeed = 100;
    question18 (String type, int maxSpeed){
        this.type=type;
        this.maxSpeed=maxSpeed;
    }
    question18(){}
}
class Car extends question18{
    String trans;
    Car(String trans){     //line n1
        this.trans=trans;
    }
    Car (String type, int maxSpeed, String trans){
        super(type,maxSpeed);      //line n2
        this.trans=trans;
    }

    public static void main(String[] args) {
        Car c1 = new Car("Auto");
        Car c2 = new Car("4W",150,"Manual");
        System.out.println(c1.type+" "+c1.maxSpeed+" "+c1.trans);
        System.out.println(c2.type+" "+c2.maxSpeed+" "+c2.trans);
    }
    // Output ===>4W 100 Auto
    //        ===>4W 150 Manual
    //


}
