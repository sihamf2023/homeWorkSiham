package december29HomeWork;

public class question17 {
    int x,y;
    public question17(int x,int y){
        initialize(x,y);
    }
    public void initialize (int x ,int y ){
        this.x= x*x;
        this.y=y*y;
    }

    public static void main(String[] args) {
        int x=3,y=5;
        question17 obj = new question17(x,y);
        System.out.println(x+" "+y);
    }}
    //Output: ========>B. 3 5
