package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task01
{
    /* TASK :
 kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
 ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
 java code create ediniz.

 */

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Array için eleman sayısı giriniz.");
        int elmnSayisi = scan.nextInt();
        int[] nums = new int[elmnSayisi];


        for (int i = 0; i < elmnSayisi; i++)
        {
            System.out.println(i+1 +". değeri giriniz");
            int num = scan.nextInt();
            nums[i] = num;
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("max ile min farki: "+(nums[nums.length-1]-nums[0]));






    }
}
