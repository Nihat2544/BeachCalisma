package ReplitSorulari;

import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
        /*
        Girilen zamanı saniyeye çeviren bir program yazınız.

     Örnek Çıktı:

    1 saat 10 dakika 50 saniye ==>

     4250 saniye
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen saat giriniz");
        int saat= scan.nextInt();

        System.out.println("lutfen dakika giriniz");
        int dakika= scan.nextInt();

        System.out.println("lutfen saniye giriniz");
        int saniye = scan.nextInt();

        int sonuc = saniye + (dakika*60) + (saat*60*60);
        System.out.println("1 saat 10 dakika 50 saniye ==> " + sonuc);







    }
}
