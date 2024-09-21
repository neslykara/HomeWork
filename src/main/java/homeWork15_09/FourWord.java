package homeWork15_09;

import java.util.Locale;
import java.util.Scanner;

public class FourWord
{
    public static void main(String[] args)
    {
        /*
          Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun

          Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
                  Output : Cesaret insana sinirlarini ogretir.

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Sirasiyla 4 farklı kelime yazınız.");
        System.out.println("Ilk kelimeyi yazınız");
        String word1 = input.next();
        System.out.println("Ikinci kelimeyi yazınız");
        String word2 = input.next();
        System.out.println("Ucuncu kelimeyi yazınız");
        String word3 = input.next();
        System.out.println("Dorduncu kelimeyi yazınız");
        String word4 = input.next();

        String cumle = word1.substring(0,1).toUpperCase(Locale.ROOT) + word1.substring(1).toLowerCase() + " "
                + word2.toLowerCase() +" "+ word3.toLowerCase() +" "+ word4.toLowerCase()+".";
        System.out.println("cumle = " + cumle);


    }
}
