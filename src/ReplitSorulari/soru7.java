package ReplitSorulari;

import java.util.Scanner;

public class soru7 {
    /*
    Char değişken yanıtının değerini test eden ve
   aşağıdaki işlemleri gerçekleştiren bir switch ifadesi yazın:

yanıt a ise,

"Talebiniz işleniyor" mesajı yazdırılır

yanıt b ise,

"yine de ilgilendiğiniz için teşekkür ederiz" mesajı yazdırılır yanıt c ise,

"Üzgünüz, şu anda herhangi bir yardım yok" mesajı yazdırılır

başka herhangi bir yanıt değeri için,

"Geçersiz giriş, lütfen tekrar deneyin!" yazdırılır
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ifade giriniz");
        String yanit= scan.nextLine();


        switch (yanit){
            case "a":
            System.out.println("Talebiniz isleniyor");
            break;
            case "b":
                System.out.println("yine de ilgilendiginiz icin tesekkur ederiz");
                break;
            case "c":
                System.out.println("Uzgunuz, şu anda herhangi bir yardım yok");
                break;
            default:
                System.out.println("Gicersiz giris, lutfen tekrar deneyin!");
        }
    }
}
