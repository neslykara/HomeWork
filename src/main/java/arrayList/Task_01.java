package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task_01
{
    /* TASK :

     * Input olarak verilen listteki isimlerden
     * icinde 'a' harfi bulunanlari silen bir code create ediniz.
     *
     * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
     * OUTPUT : [Veli,Omer]
     */


    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));

        System.out.println(names);

        for (int i = 0; i < names.size() ; i++)
        {
            if (names.get(i).toLowerCase().contains("a"))
            {
                names.remove(names.get(i));
                i--;
            }
        }



        System.out.println(names);

    }
}
