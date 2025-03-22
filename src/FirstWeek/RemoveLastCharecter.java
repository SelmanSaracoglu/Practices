package FirstWeek;

import java.util.Scanner;

public class RemoveLastCharecter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir String giriniz: ");
        String str = scanner.nextLine();
        String newStr = str.substring(0, str.length()-1);
        String secondStr = str.substring(2,str.length()-3);

        System.out.println(newStr);
        System.out.println(secondStr);

        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(str.length()-1);
        System.out.println(sb);
    }
}
