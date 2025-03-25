package PracticeOfArrays;

import java.util.ArrayList;

public class ReverseString {

    public static void main(String[] args) {

        String sentence = "Java is fun";

        // Cümleyi boşluk karakterine göre kelimelere ayırıyoruz
        String[] words = sentence.split(" ");

        for (int i = words.length - 1; i >= 0 ; i--) {
            System.out.print(words[i] + " ");
        }

        //Bir cümlede kaç kelime olduğunu hesaplayın.
        String sentences = " Java is fun and very important so that you have to learn. ";
        // split(" ") cümlede boşluk kullnaıldığında başta sonda onları da kelime olarak sayabilir. Hatalara neden olur.
        String[] wordss = sentences.trim().split("\\s+"); // Birden fazla boşluğu tek boşluk gibi işler
        System.out.println("\nKelime Sayisi: " + wordss.length);


        // Bir dizideki tüm tek sayıları ve çift sayıları ayrı ayrı listeleyin.
        int[] numbers = {12, 35, 1, 10, 34, 1, -1, -9, -12, 17, 56,98,-46};

        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }else {
                oddNumbers.add(number);
            }
        }

        System.out.println("Cift Sayilar: " + evenNumbers);
        System.out.println("Tek Sayilar: " + oddNumbers);

        //Bir String içindeki tüm sesli harfleri (a, e, i, o, u) sayın.
        String str = " Java is fun and very important so that you have to learn. ";

        String string = "aeiou";

        int count = 0;

        for (char ch : str.toCharArray()){ // toCharArray() ile String’i karakterlere bölüyoruz.
            if(string.indexOf(ch) != -1) {
                count ++;
            }

        }
        System.out.println("Sesli harf sayısı: " + count);




    }
}
