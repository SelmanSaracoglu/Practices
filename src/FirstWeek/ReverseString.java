package FirstWeek;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string to reverse: ");
        String str  = scanner.nextLine();

        String reverse = new StringBuilder(str).reverse().toString();
        System.out.println(reverse);

        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

        char[] arr = str.toCharArray();
        for (int i = arr.length -1 ; i>=0 ; i--) {
            System.out.print(arr[i]);
        }
        scanner.close();
    }
}
