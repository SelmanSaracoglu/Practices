package FirstWeek;

import java.util.Scanner;

public class IsPalindromOrNot {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a statement to check if it is Palindrome: ");
        String isPalindrome= scanner.nextLine();

        // Girilen yazıyı küçük harfe çevir ve boşlukları temizle
        String cleanedInput = isPalindrome.replaceAll("[\\W_]+", "").toLowerCase();

        String reverse = new StringBuilder(cleanedInput).reverse().toString();
        System.out.println(reverse);

        if (reverse.equalsIgnoreCase(cleanedInput)) {
            System.out.println("Girilen deger " + isPalindrome + " bir palindrome degerdir.");
        } else {
            System.out.println("Girilen deger " + isPalindrome + " bir palindrome deger degildir.");
        }

        scanner.close();

    }
}
