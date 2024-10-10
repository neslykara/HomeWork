package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task_02
{
    /* TASK :
ayna check sorusu:
 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
 output : verilen array simetriktir
 */

    public static void main(String[] args)
    {
        ArrayList<Integer> nums1  = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 4, 3, 2, 1));
        ArrayList<Integer> nums2 = new ArrayList<>();

        for (int i = nums1.size()-1 ; i >= 0 ; i--)
        {
            nums2.add(nums1.get(i));
        }

        // Kontrol için arrayListleri yazdiralim
       // System.out.println(nums1);
       // System.out.println(nums2);


        if (nums1.equals(nums2))
        {
            System.out.println("Verilen array simetriktir");
        }else
        {
            System.out.println("Verilen array simetrik değildir");
        }


    }
}
