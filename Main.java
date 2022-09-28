import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Sorts words in a sentence by a quantity of the letter appearance
 *
 * @author Myroslava
 * @version 1.0
 */
public class Main {
    private static long charCount(String s, char c) {
        return s.chars().filter(c1 -> c1 == c).count();
    }

    public static void main(String[] args) {
        String text = new Scanner(System.in).nextLine();
        char letter = new Scanner(System.in).next().charAt(0);
        //String text = "woorld ooof goooo Hello";
        //char letter = 'o';
        String sorted = Arrays.stream(text.split(" "))
                .sorted(Comparator.comparingLong(w -> charCount(w, letter)))
                .collect(Collectors.joining(" "));
        System.out.println(sorted);
    }
}