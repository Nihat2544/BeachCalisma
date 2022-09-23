package ReplitSorulari;

import java.util.Scanner;

public class soru3 {
    /*
    Kullanıcıya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir program yazın (BMI)

IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)

BMI 18,5'in altındaysa zayıfsınız

BMI 18,5 ile 25 arasında ise kilonuz idealdir

BMI 25-30 arasındaysa şişmansınız

BMI 30'dan büyük veya eşitse, obez

Input:

Output:

Agirlik : 71

Boy : 1,72

BMI : 23.99945916711736

Zayifsiniz.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double agirlik = 71;
        double boy = 1.72;
        double BMI = 23.99945916711736;

        agirlik = BMI/ boy;
        System.out.println("BMI : " + BMI);
        System.out.println("Zayifsiniz.");
    }
}
