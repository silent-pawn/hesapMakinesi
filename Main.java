import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1. Sayı: ");
        double a = scan.nextDouble();

        System.out.println("2. Sayı : ");
        double b = scan.nextDouble();

        System.out.println("İşlem seçiniz : ");
        System.out.println("1 - Toplama");
        System.out.println("2 - Çıkarma");
        System.out.println("3 - Çarpma");
        System.out.println("4 - Bölme");
        System.out.println("İşleminiz : ");
        int islem = scan.nextInt();

        double sonuc = 0;
        boolean gecerliIslem = true;

        switch (islem) {
            case 1:
                sonuc = a + b;
                break;
            case 2:
                sonuc = a - b;
                break;
            case 3:
                sonuc = a * b;
                break;
            case 4:
                if (b!=0) {
                    sonuc = a / b;
                } else {
                    System.out.println("Hata bir sayı sıfıra bölünemez");
                        gecerliIslem = false;
                }
                break;
            default:
                System.out.println("Geçersiz işlem seçtiniz");
                gecerliIslem = false;
                break;
        }
        if (gecerliIslem) {
            System.out.println("Sonuç : " + sonuc );
        }



    }
}