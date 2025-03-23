package DesignWithCodes;

public class SayiPrimidi {
    public static void main(String[] args) {

        // Çift sayıları tutacak bir dizi oluşturuyoruz
        int[] ciftSayilar = new int[10]; // 1'den 20'ye kadar olan 10 çift sayıyı tutacak
        int index = 0;


        for (int i = 1; i <= 20; i++) { // 1'den 20'ye kadar olan çift sayıları buluyoruz
            if (i % 2 == 0) {
                ciftSayilar[index] = i;  // Eğer sayı çiftse Dizinin ilgili indeksine ekliyoruz
                index++;
            }
        }

        int satirSayisi = 1;  // İlk satırda 1 sayı olacak
        index = 0;  // Çift sayıları kullanacağımız için indeksi sıfırlıyoruz

        for (int i = 1; i <= 5; i++) {  // 5 satır olacak
            // Satır başındaki boşlukları yazdırıyoruz (piramidin ortalanması için)
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");  // Boşluk
            }

            // Çift sayıları yazdırıyoruz
            for (int j = 1; j <= satirSayisi; j++) {
                if (index < ciftSayilar.length){
                    System.out.print(ciftSayilar[index] + " ");
                    index++;  // Bir sonraki çifti almak için indeksi artırıyoruz
                }
            }

            // Satır sonunda yeni bir satıra geçiyoruz
            System.out.println();

            // Bir sonraki satır için satırdaki sayı adedini artırıyoruz
            satirSayisi++;

        }
    }
}