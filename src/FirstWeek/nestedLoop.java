package FirstWeek;

public class nestedLoop {

    public static void main(String[] args) {

        for (int i = 1; i <= 10 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j);
                }
            System.out.println("");
        }

        System.out.println( "==========================");

        int i = 1;
        while (i<=10){
            int j = 1;
            while (j<=i){
                System.out.print(j);
                j ++;
            }
            System.out.println();
            i ++;
        }


    }
}
