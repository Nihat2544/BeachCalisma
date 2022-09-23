package ReplitSorulari;

import java.util.Scanner;


public class soru5 {
    /*
    Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak
    verilen formata ceviren java kodunu yaziniz.

Input :

John White

1234234534561478

Output : Name :

J*** W****

CCN : **** **** **** 1478

Ilk Harfler Buyuk harf ile baslamalidir.
     */
    public static void main(String[] args) {
        String isim="John";
        String soyisim="white";
        String kkNo="1234 2345 3456 1478";

        hadiBakalim(isim,soyisim,kkNo);





    }

    private static void hadiBakalim(String isim, String soyisim, String kkNo) {

        isim= isim.substring(0,1).toUpperCase()+isim.substring(1)
                .replaceAll("\\w", "*");
        soyisim=soyisim.substring(0,1).toUpperCase()
                + soyisim.substring(1).replaceAll("\\w", "*");
        ;
        String kk1=kkNo.substring(0,14).replaceAll("\\w", "*");
        String kkGeriKalan=kkNo.substring(14);

        System.out.println("Name : " + isim+" "+ soyisim);
        System.out.println("CCN : " + kk1 + kkGeriKalan);
    }
}
