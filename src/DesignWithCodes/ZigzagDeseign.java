package DesignWithCodes;

public class ZigzagDeseign {
    public static void main(String[] args) {
        int rows = 5;
        int cols= 9;

        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j <cols ; j++) {
                // Zigzag hareketini hesapla
                if ((i + j) % (rows - 1) == 0 || (i-j) % (rows-1) == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Boşluk ekleyerek hizalama yap
                }

            }
            System.out.println(); // Bir satır tamamlandığında alt satıra geç
        }
    }
}
