package arrays;

public class Task05
{
    /*  TASK :
     * write a java program that calculates the average value of array elements
     * Print elements that are greater than avarage
     * (dizi elemanlarinin ortalama degerini hesaplayan ve
     * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
     * input[]= {1,2,3,4,5,6,7}
     * Output : 4
     */


    public static void main(String[] args)
    {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        int ort = 0;
        int sum=0;

        for (int w : nums)
        {
            sum=sum+w;
        }
        ort=ort+sum/ nums.length;
        System.out.println(ort);
        for (int w : nums){
            if (w>ort){
                System.out.print(w+" ");
            }
        }


    }
}
