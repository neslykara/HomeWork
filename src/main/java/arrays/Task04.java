package arrays;

public class Task04
{
    /*  TASK :
     *  verilen bir int  Arrayde toplamlari istenen degere esit olan sayi ciftlerini
     * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1};
     * int istenenToplam=9;
     */

    public static void main(String[] args)
    {
        int[] nums = new int[]{5,7,-6,4,2,15,3,8,1};
        int istenenToplam=9;

        for (int i = 0; i < nums.length; i++)
        {
            for (int j = 0; j < nums.length; j++)
            {
                if(nums[i]+nums[j]==istenenToplam)
                {
                    System.out.println(nums[i] + " ile "+nums[j]);
                }
            }


        }
    }
}
