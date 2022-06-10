// Java'da döngüler kullanarak yıldızlar ile elmas yapınız.

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("(2n-1) Satir Sayili Elmasin Olusmasi icin n Degerini Giriniz : ");
        int n = inp.nextInt();

        if (n <= 1) {
            System.out.print("Hatali Deger Girdiniz, Lutfen Tekrar Deneyiniz ! ");
        } else {
            // İlk olarak satır sayısını döngüye sokuyoruz.
            for (int i = 1; i <= n; i++) {
                // Yıldızlardan önce gelecek boşlukları formülize ederek döngüye sokuyoruz.
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                // Yıldız sayısını formülize ederek döngüye sokuyoruz.
                for (int k = 1; k <= ((2 * i) - 1); k++) {
                    System.out.print("*");
                }

                System.out.println();
            }

            // Yukarda elmasın yarısını yaptık. Şimdi alt yarısı için işlemleri tersten yapıyoruz.

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * n - ((2 * i) + 1)); k++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }
    }
}
