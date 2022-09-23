package ReplitSorulari;

import java.util.Scanner;

public class soru1 {
    /*
    Kullanıcıdan üç basamaklı bir sayı girmesini ve
    bu sayının basamaklarının toplamını bulmasını isteyin.

Örnek Çıktı:

Verilen tamsayının rakamları toplamı 10'dur.
     */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 3 basamakli bir sayi giriniz");
        int sayi=scan.nextInt();


        int birlerBasamagı= 0;
        int rakamlarToplamı= 0;
        int ilkGirilenSayi = sayi;

        // şuanda sayımız 541 bb=0, rt=0

        birlerBasamagı= sayi%10; //1
        rakamlarToplamı += birlerBasamagı;
        sayi/= 10;

        // şuanda sayı 54 bb=1, rt=1

        birlerBasamagı= sayi%10; //6
        rakamlarToplamı += birlerBasamagı; // rt=13
        sayi/= 10;

        //şuanda sayı 5 bb=6, rt=13

        birlerBasamagı= sayi%10; //2
        rakamlarToplamı += birlerBasamagı; //rt=13+2=15
        sayi/= 10;



        System.out.println(ilkGirilenSayi + " sayisinin rakamlar Toplamı = " + rakamlarToplamı);






    }
}
