package arrays;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Practice02
{
        /*
          icinde 200 tane 1000'den kucuk pozitif tamsayi olan bir list olusturun
          kullanicidan bir sayi isteyip
          listede var olup olmadigini kullaniciya yazin
         */

    public static void main(String[] args)
    {
        ArrayList<Integer> nums = new ArrayList<>();
        Random rndm = new Random();
        Scanner scan = new Scanner(System.in);

        int i = 0;
        while (true)
        {
            int sayi = rndm.nextInt(1000);
            if (!nums.contains(sayi)) {
                nums.add(sayi);
            }
            if (nums.size()==200)
            {
                break;
            }
            i++;
        }
        nums.sort(null);
        System.out.println(nums);

        System.out.println("1 ile 1000 aralığında bir sayi giriniz.");
        int kullaniciSayi=scan.nextInt();


        for (int w : nums)
        {
            if(kullaniciSayi==w)
            {
                System.out.println(kullaniciSayi+ " -> nums listede yer almaktadır.");
            }
        }

    }




}
