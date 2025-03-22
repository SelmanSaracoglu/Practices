package FirstWeek;

import java.util.Scanner;

public class IsPalindromOrNotWithMethod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a string to check: ");
        String isPalindrome = scanner.nextLine();

        String cleanedInput = isPalindrome.replaceAll("[\\W_]", "");

        String reverse = getReserve(cleanedInput);

        // Ters çevrilmiş haliyle karşılaştır
        if (reverse.equals(cleanedInput)) {
            System.out.println("Girilen değer: '" + isPalindrome + "' bir palindrome'dur.");
        } else {
            System.out.println("Girilen değer: '" + isPalindrome + "' bir palindrome değildir.");
        }

        scanner.close();

    }

    public static String getReserve(String input) {
        StringBuilder reversed = new StringBuilder();
        // String'in her karakterini tersten ekleyerek yeni bir string oluştururuz
        for (int i = input.length()-1 ; i >= 0 ; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

}
