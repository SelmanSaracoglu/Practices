package PracticeOfArrays;

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



    }
}
