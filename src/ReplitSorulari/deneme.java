package ReplitSorulari;

import java.util.Scanner;

 class Main{
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 3 basamakli birsayi giriniz");
        int sayi = scan.nextInt();
// sayi=541;

        int birlerBasamagi=0;
        int rakamlarTop=0;
        int ilkGirilenSayi=0;
// şuanda sayi 541
        birlerBasamagi=sayi%10;
        rakamlarTop +=birlerBasamagi;
        sayi/=10;

// şuanda sayi 54
        birlerBasamagi=sayi%10;
        rakamlarTop +=birlerBasamagi;
        sayi/=10;

//şuanda sayi= 5
        birlerBasamagi=sayi%10;
        rakamlarTop +=birlerBasamagi;
        sayi/=10;

// şuanda sayi=0;
        System.out.println(ilkGirilenSayi + "sayisinin rakamlari toplami : " + rakamlarTop);


         }
        }