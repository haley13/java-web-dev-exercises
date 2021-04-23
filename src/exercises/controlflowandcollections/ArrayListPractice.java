package exercises.controlflowandcollections;




import java.util.ArrayList;


public class ArrayListPractice {
    public static void main(String[] args) {
    }

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0)
                total += integer;
        }

        return total;
    }
}

//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(4);
//        numbers.add(5);
//        numbers.add(6);
//        numbers.add(7);
//        numbers.add(8);
//        numbers.add(9);
//        numbers.add(10);
//
//      int total = addNumbers.(numbers);
//


