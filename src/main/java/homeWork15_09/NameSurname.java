package homeWork15_09;

import java.util.Scanner;

public class NameSurname
{
    public static void main(String[] args)
    {
        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        Scanner input = new Scanner( System.in);
        System.out.println("Lutfen adinizi giriniz");
        String name = input.next();

        System.out.println("Lutfen soyadinizi giriniz");
        String surname = input.next();

        if (name.length() > surname.length())
        {
            System.out.println(name + " daha uzundur");
        }
        else if (surname.length() > name.length())
        {
        System.out.println(surname + " daha uzundur.");
        }
        else
        {
            System.out.println(name +" ve " + surname + " ayni uzunluktadir.");
        }







    }
}
