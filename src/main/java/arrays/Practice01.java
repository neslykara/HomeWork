package arrays;

import java.util.Arrays;

public class Practice01
{
          /*
          Asagidaki multi dimensional array'in
          ic array'lerindeki tum elemanlarin toplamini birer birer bulan
          ve herbir sonucu yeni bir array'in elemani yapan
          ve yeni array'i ekrana yazdiran bir program yaziniz
          Ornek; {{1,2,3}, {4,5}, {6, 7} } ==> 1 + 2 + 3 = 6 4+5=9 6+7=13 ==> output: (6, 9, 13)
          */

    public static void main(String[] args)
    {
        int[][] nums = new int[][]{{1,2,3}, {4,5}, {6, 7} };
        int[] yeni = new int[nums.length];
        int idx=0;

        for (int[] w : nums)
        {
            int sum=0;
            for (int i = 0; i < w.length; i++)
            {
                sum = sum + w[i];
            }
            yeni[idx]=sum;
            idx++;

        }
        System.out.println(Arrays.toString(yeni));


    }





}
