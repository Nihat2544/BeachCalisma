package ReplitSorulari;

import java.util.Scanner;

public class soru4 {
    /*
    Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.

INPUT:

Dakika sayısı: 3456789

OUTPUT :

3456789 dakika yaklaşık 6 yıl 210 gündür
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int dakika =3456789;
        int yil =0;
        int gun=0;

        yil = dakika/(365*24*60);
        int artanYil=dakika - (yil*(365*24*60));
        gun= artanYil/(60*24);
        System.out.println("Dakika sayısı 3456789 : " + yil + " yıl " + gun + " gündür");


        /*
        - Beach_80.src.day35_inheritancedaConstructorKullanimi.Child Classlar parent classlar daki tüm özelliklere sahiptir
2- Beach_80.src.day35_inheritancedaConstructorKullanimi.Child Classlar parent classlardaki bazı özellikleri kendine uyarlayabilir
3- Beach_80.src.day35_inheritancedaConstructorKullanimi.Child classlar parent classlarda olmayan bazı extra özelliklere sahip olabilir.
         */

        /*
        *Alican parent classlarının her birinde kendini ifade edebilir.
* ancak personel Alican dediğimizde alt classlara artık bakmayız,
yani personel alican dediysek bunun artık işçi mi beyaz yakalımı o artık beni ilgilendirmiyor
personel Alican dediysem personel özellikleri beni ilgilendiriyor.

         */
    }
}
