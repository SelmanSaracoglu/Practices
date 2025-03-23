package DesignWithCodes;

public class ChristmasTree {

    public static void main(String[] args) {

       int row = 7;

        for (int i = 1; i <= row ; i++) {
            for (int j = i; j <= row ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i -1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= row - 2; i++) {
            System.out.print(" ");
        }
        System.out.println("|||||");

    }
}
