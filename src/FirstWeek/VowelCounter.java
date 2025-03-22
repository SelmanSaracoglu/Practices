package FirstWeek;

import java.util.Scanner;

public class VowelCounter {

       public static int countVowels(String str) {
        String vowels = "aeiouAEIOU";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (vowels.indexOf(ch) != -1){
                count++; }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir metin giriniz: ");
        String input = scanner.nextLine();

        System.out.println("Sesli harf sayısı: " + countVowels(input));

        scanner.close();
    }
}
