package exercises.controlflowandcollections;





import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        String rawString = "I would not, could not, in a box. " +
                "I would not, could not with a fox." +
                " I will not eat them in a house. " +
                "I will not eat them with a mouse.";

        ArrayList<String> wordList= new ArrayList<>(Arrays.asList(rawString.split(" ")));
        Scanner input = new Scanner(System.in);

        System.out.println(sumEven(numbers));
        System.out.println("Enter a word length:");
        int numChars=input.nextInt();

        printFiveLetterWords(wordList, numChars);
    }

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }

        return total;

    }

    public static void printFiveLetterWords(ArrayList<String> arr, int length){
        for (String word:arr){
            if (word.length() == length) {
                System.out.println(word);
            }
        }
    }
}





