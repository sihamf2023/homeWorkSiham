package december29HomeWork;

public class question15 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Duke");
        String str1 = sb1.toString();
        String str2= str1;
        System.out.println(str1== str2);
    } // output ===> A) String str2= str1;
}
