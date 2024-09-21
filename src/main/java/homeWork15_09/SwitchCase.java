package homeWork15_09;

import java.util.Scanner;

public class SwitchCase
{
    public static void main(String[] args)
    {
        // Girilen uc haneli bir sayının okunusunu yazı ile yazdırınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli bir sayi giriniz.");
        int sayi = input.nextInt();

        if (sayi <100 || sayi >=1000)
        {
            System.out.println("Sayi 3 basamakli olmalıdir.Tekrar deneyiniz.");
            return;
        }

        int yuzler = sayi/100;
        int onlar = (sayi/10) % 10;
        int birler = sayi % 10 ;

        switch (yuzler)
        {
            case 1: System.out.print("yuz "); break;
            case 2: System.out.print("ikiyuz ");break;
            case 3: System.out.print("ucyuz ");break;
            case 4: System.out.print("dortyuz ");break;
            case 5: System.out.print("besyuz ");break;
            case 6: System.out.print("altıyuz ");break;
            case 7: System.out.print("yediyuz ");break;
            case 8: System.out.print("sekizyuz ");break;
            case 9: System.out.print("dokuzyuz ");break;
        }

        switch (onlar)
        {
            case 0: System.out.print(" "); break;
            case 1: System.out.print("on "); break;
            case 2: System.out.print("yirmi ");break;
            case 3: System.out.print("otuz ");break;
            case 4: System.out.print("kırk ");break;
            case 5: System.out.print("elli ");break;
            case 6: System.out.print("altmıs ");break;
            case 7: System.out.print("yetmis ");break;
            case 8: System.out.print("seksen ");break;
            case 9: System.out.print("doksan ");break;
        }

        switch (birler)
        {
            case 0: System.out.print(""); break;
            case 1: System.out.print("bir"); break;
            case 2: System.out.print("iki");break;
            case 3: System.out.print("uc");break;
            case 4: System.out.print("dort");break;
            case 5: System.out.print("bes");break;
            case 6: System.out.print("altı");break;
            case 7: System.out.print("yedi");break;
            case 8: System.out.print("sekiz");break;
            case 9: System.out.print("dokuz");break;

        }






    }
}
