package day13_practice;

public class Q02 {
      /*
// Stringi ters cevirmek icin bir Java Programi yazin
//1.Yol: StringBuilder () kullanarak
//2.Yol: String Classini kullanarak
//3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
  */
      //1.Yol: StringBuilder () kullanarak
    public static void main(String[] args) {

        String input="All is well";

        StringBuilder str= new StringBuilder();

        str.append(input);// StringiBuilder methodudur ekleme yapar
        System.out.printf("str=" + str);

        String tersInput=str.reverse().toString();
        System.out.printf("tersInput =" + tersInput);
    }
}
