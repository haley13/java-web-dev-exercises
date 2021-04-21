package exercises;

import java.util.Scanner;
public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Search for a term:".toLowerCase());
        String story = ("Alice was beginning to get very tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she had peeped into the book her sister " +
                "was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?' ".toLowerCase());
       String search = input.next();
        if (story.contains(search)) {
            System.out.println("match".toLowerCase());
        } else {
            System.out.println("no match".toLowerCase());
        }
    }
}

