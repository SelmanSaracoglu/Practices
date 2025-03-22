package FirstWeek;

import java.util.Scanner;

public class ContainsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your statement: ");
        String statement = scanner.nextLine().trim();

        System.out.println("Please enter the word which you aare searching: ");
        String word = scanner.nextLine().trim();

        /*
        if (statement.contains(word)) {
            boolean b = true;
            System.out.println(b);
        }else{
            boolean b = false;
            System.out.println(b);
        }
        */

        boolean found = statement.contains(word);
        System.out.println(found);

        scanner.close();

    }
}
