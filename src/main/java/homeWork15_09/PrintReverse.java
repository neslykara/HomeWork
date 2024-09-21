package homeWork15_09;

import java.util.Scanner;

public class PrintReverse
{
    public static void main(String[] args)
    {
        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 4 harfli bir kelime yaziniz");

        String s = input.next();
        String reverse = "";

        if (s.length() ==4)
        {
            for (int i = s.length()-1 ; i >= 0 ; i--)
            {
                char ch = s.charAt(i);
                reverse = reverse + ch ;

            }
            System.out.println(reverse);

        }
        else
        {
            System.out.println("Yazdiginiz kelime 4 harfli olmalidir.");
        }

    }
}
