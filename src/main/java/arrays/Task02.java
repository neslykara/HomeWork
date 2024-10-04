package arrays;

import java.util.Arrays;

public class Task02
{
    /* TASK :
multidimensional arrayin iç array lerindeki tüm elemanların toplamını birer birer bulan
ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana yazdıran programı yaziniz.
input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}
   */

    public static void main(String[] args)
    {
        int[][] nums = new int[][]{{10,20,30},{4},{6,7,20}};
        System.out.println(Arrays.deepToString(nums));

        int[] yeni = new int[nums.length];
        int index =0;

        for (int[] w : nums)
        {
            int sum =0;

            for (int i = 0; i < w.length; i++)
            {
                sum=sum+w[i];
            }
            yeni[index]=sum;
            index++;

        }




        System.out.println(Arrays.toString(yeni));






    }

}
