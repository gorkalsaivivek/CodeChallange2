/**
 * Created by vivigorkal on 2/12/2016.
 */

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            input = input.replaceAll("\\P{Alnum}", "");
            StringBuilder reverseInput = new StringBuilder();
            reverseInput = reverseInput.append(input);
            reverseInput = reverseInput.reverse();
            palindromeCheck(input, reverseInput.toString());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static boolean palindromeCheck(String input, String stringReverse) {

        if (input.equalsIgnoreCase(stringReverse)) {
            System.out.println(input + " is a palindrome");
            return true;
        } else {
            System.out.println("Not a palindrome");
            return false;
        }

    }
}
