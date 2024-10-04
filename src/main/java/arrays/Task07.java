package arrays;

import java.util.Arrays;

public class Task07
{
    /* TASK :
     * write a method that accepts a 2 dimensional array and finds the max value
     * (2 boyutlu bir diziyi kabul eden ve maksimum degeri bulan bir method yazin )
     * Input : {{1,2,-3},{41,55},{-61,-17,80}}
     * Output : 80
     */
    public static void main(String[] args)
    {
        int[][] nums = new int[][] {{1,2,-3},{41,55},{-61,-17,80}};
        int totalLengt =0;



        for (int[] w: nums)
        {
                totalLengt=totalLengt+w.length;
        }

        int[] yeni = new int[totalLengt];
        int idx =0;

        for (int[] w : nums){
            for(int k : w){
                yeni[idx]=k;
                idx++;

            }
        }
        Arrays.sort(yeni);
        System.out.println(Arrays.toString(yeni));
        System.out.println("max değer = "+yeni[yeni.length-1]);


    }
}
