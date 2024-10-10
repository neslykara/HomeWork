package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task_05
{
    /* TASK :
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
     */


    public static void main(String[] args)
    {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3, 5, 1, 2, 7, 9, 2, 3, 5, 7));

            int i = 1;
            while (true)
            {

                int sum = 0;
                for (int j = 0; j < i ; j++)
                {
                    sum = sum + nums.get(0);
                    nums.remove(0);
                }
                System.out.println(sum);
                i++;

                if(nums.size()==0)
                {
                    break;
                }
            }





    }
}
