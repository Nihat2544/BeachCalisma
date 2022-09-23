package ReplitSorulari;

import java.util.Scanner;

public class soru8 {
    /*
    Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.
INPUT:
Ay Numarasi:
2
Yil :
2016
OUTPUT :
Subat 2016 29 Gundur.
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen ay giriniz");
        int gunAy= scan.nextInt();
        System.out.println("Lutfen yil giriniz");
        int yil= scan.nextInt();

        if (gunAy>0){
            System.out.println(gunAy);
        }
        if (yil>0){
            System.out.println(yil);

        }else {
            System.out.print("Ay Numarasi:" + gunAy + "Yil : " + yil);
        }

    }
}
