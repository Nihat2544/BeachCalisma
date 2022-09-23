package ReplitSorulari;

import java.util.Scanner;

public class soru9 {
    /*
    Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır.
    Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.

Eger aynı karakterlere sahipse

"isim ayni karakterlere sahiptir." yazdirin.

Eger ayni kaakterlere sahip degilse

"Dizenin benzersiz karakterleri var" yazdirin.

Ternary kullanin.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen uc harfli bir isim giriniz");
        String isim = scan.nextLine();
        String isim1="ada";
        String isim2="ali";

        if (isim.equals(isim1)) {
            System.out.println("isim ayni karakterlere sahiptir.");
        } if (isim.equals(isim2)){
                System.out.println("Dizenin benzersiz karaktleri var");
        }

    }
}
