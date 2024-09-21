package homeWork15_09;

import java.util.Scanner;

public class StringManipulation01
{
    public static void main(String[] args) {
        //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin
        Scanner input = new Scanner(System.in);

        System.out.println(" Lutfen isminizi yazınız");
        String name = input.next();

        System.out.println("Lutfen soyisminizi yazınız");
        String surname = input.next();

        System.out.println("İsim Soyisim:" + name.toUpperCase() + " " + surname.toUpperCase());



        /*
         2 Strings olusturun -> string1 = "01234" and string2 = "56789"
         1.yol: concat() function ile concatenate string1 and string2
         2.yol: operator kullanarak concatenate string1 and string2
         konsolda yazdiriniz
         String seklinde verilen asagidaki fiyatlarin toplamini bulunuz
         String  str 1= "$13.99"
         String str 2= "$10.55"
         ipucu: Double parseDouble() methodunu kullanabilirsiniz.
         */

        String s1 = "01234";
        String s2 = "56789";
        System.out.println(s1 + s2);



        String  str1 = "$13.99";
        String str2 = "$10.55";

        str1 = str1.replace("$","");
        str2 = str2.replace("$" , "");

        Double total = Double.valueOf(str1) + Double.valueOf(str2);
        System.out.println("total = " + total);


          /*
           Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
        1) \\d    ==> tum rakamlar
           \\D    ==> tum rakam disi character ler
        2) \\w    ==> A->Z      a->z         0->9    _
           \\W    ==> A->Z    a->z         0->9    _ disindaki hersey
        3) \\s    ==> space
           \\S    ==> space disindaki hersey
           */

        /*
          Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
          iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin

          ornek
          input = Ali
          output = lilili

          input = el
          output = el
         */

        System.out.println("Lutfen bir kelime yazınız");
        String word = input.next();

        if(word.length()>=3)
        {
            char ch1 = word.charAt(word.length()-2);
            char ch2 = word.charAt(word.length()-1);
            System.out.print("" + ch1 + ch2);
            System.out.print("" + ch1 + ch2);
            System.out.print("" + ch1 + ch2);
        }
        else
        {
            System.out.println(word);
        }


    }
}
