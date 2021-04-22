package exercises;

import java.util.Arrays;

public class ArrayString {
    public static void main(String[] args) {
        String rawString= "I would not, could not, in a box. " +
                "I would not, could not with a fox." +
                " I will not eat them in a house. " +
                "I will not eat them with a mouse.";
       String[] sentence =rawString.split(" ");
        System.out.println(Arrays.toString(sentence));
        String[] sentence2 =rawString.split("\\.");

        System.out.println(Arrays.toString(sentence2));

    }
}
