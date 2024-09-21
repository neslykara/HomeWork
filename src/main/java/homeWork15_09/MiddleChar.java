package homeWork15_09;

import java.util.Scanner;

public class MiddleChar
{
    public static void main(String[] args)
    {
        /*
        Kullanicidan bir kelime girmesini isteyin.
        -> Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
        -> kelimenin ortasindaki karakteri yazdirin.
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");

        String word = input.next();

        if (word.length() % 2 != 0 && word.length() >= 3)
        {
            char ch = word.charAt(word.length() / 2);
            System.out.println(ch);
        }

    }
}
