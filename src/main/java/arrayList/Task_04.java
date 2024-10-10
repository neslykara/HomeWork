package arrayList;

import java.util.ArrayList;

public class Task_04
{
    /*  Write a Java program to get a String from user as input and find the maximumCounts occurring character in that string.
     (Ignore case sensitivity)

     Kullanicidan aldiginiz bir string icinde en cok tekrar eden karakteri yazdiran code create ediniz.
   input : Learning java is easy
   output: maximumCounts occurring character is : a
    */

    public static void main(String[] args)
    {
        ArrayList<Character> ch = new ArrayList<>();
        ArrayList<Integer> chSayisi = new ArrayList<>();

        String str = "Learning java is easy";
        str = str.toLowerCase().replaceAll(" ","");

        //String karakterlerini arrayListe ekleyelim
        for (int i = 0; i < str.length(); i++)
        {
            ch.add(str.charAt(i));
        }
        System.out.println(ch);

        for (int i = 0; i < ch.size(); i++)
        {
            int sayac = 0;


            for (int j = 0; j < ch.size() ; j++)
            {
                if (ch.get(i).equals(ch.get(j))) //arraylist te dolan aynı karakter varsa sayacı artırarak kaç tane olduğunu bul
                {
                    sayac++;
                }
            }
            chSayisi.add(sayac); // karakter sayılarını bos arrayList e ekledik
        }
        System.out.println(chSayisi); //Kontrol için arrayList i yazdırdık

        int max = chSayisi.get(0);

        for (int i = 0; i <chSayisi.size() ; i++) //yeni arraylistteki en büyük sayıyı bul.
        {
            max = Math.max(max, chSayisi.get(i));

        }
        //System.out.println(max);
        System.out.println("En çok tekrar eden karakter = " + ch.get(chSayisi.indexOf(max))); //en büyük sayı önceki arrayda en çok tekrar eden karakter ile aynı indexte





    }
}
