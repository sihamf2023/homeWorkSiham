package december25HomeWork;

public class question8 {
    public static void main(String[] args) {
        String [] [] arr = {{"A", "B", "C"},{"D", "E"}};
        for (int i = 0; i < arr.length ; i++) { //0
            for (int j = 0; j < arr[i].length; j++) { //
                System.out.print(arr [i][j] + " ");
                if (arr[i][j].equals("B")) {
                    continue;
                }

            }
            continue;     //Output ===> B) A B C D E
        }
    }

}
