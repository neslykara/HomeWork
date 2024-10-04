package arrays;

import java.util.Arrays;

public class Task09
{
    /* TASK :
      given an int array and find the squares of the elements
      (Verilen bir int dizisi icin elemanlarin karelerini bulun )
      Example:{2,6,4,5,8,9}
      output:{4,36,16,25,64,81}
      */
    public static void main(String[] args)
    {
        int[] nums = {2,6,4,5,8,9};
        int[] numsKaresi = new int[nums.length];
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            numsKaresi[i]=nums[i]*nums[i];
        }
        System.out.println(Arrays.toString(numsKaresi));





    }
}









