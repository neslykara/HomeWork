package arrays;

import java.util.Arrays;

public class Task10
{

    /*
 TASK:
 you have a string "GayetBasarılı"
 with arrays change it to "CoookBasarılı" and write changing array
 (String iniz: "GayetBasarılı"  Diziyi "CoookBasarılı" ye cevirin )

 */
    public static void main(String[] args)
    {
        String s = "GayetBasarılı";
        System.out.println(s);
        char[] ch1 =s.toCharArray(); //toCharArray(): String'i bir karakter dizisine (char[]) dönüştürüyoruz.
        System.out.println(Arrays.toString(ch1));
        char[] ch2 ={'C','o','o','o','k'};
        for (int i = 0; i < ch2.length; i++) {
            ch1[i]=ch2[i];
        }
        System.out.println(Arrays.toString(ch1));

        String sYeni = new String(ch1);
        System.out.println(sYeni);



    }
}
