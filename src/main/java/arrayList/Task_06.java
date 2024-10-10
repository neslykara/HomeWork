package arrayList;

import java.util.ArrayList;

public class Task_06 {
    /* TASK :
100 den kucuk asal sayilari yazdiran bir code create ediniz.
 */

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 2; i < 100; i++) //100 e kadar olan sayıları arrayList e ekle.
        {
            nums.add(i);
        }
       // System.out.println(nums); //kontrol için


        for (int i = 0; i <nums.size(); i++)
        {
            if (nums.get(i) != 2 && nums.get(i) % 2 == 0) {
                nums.remove(nums.get(i));
                i--;
            }
            else if (nums.get(i)!=3 && nums.get(i)%3==0)
            {
                nums.remove(nums.get(i));
                i--;
            }
            else if (nums.get(i)!=5 && nums.get(i)%5==0)
            {
                nums.remove(nums.get(i));
                i--;
            }
            else if (nums.get(i)!=7 && nums.get(i)%7==0)
            {
                nums.remove(nums.get(i));
                i--;
            }
            else if (nums.get(i)!=11 && nums.get(i)%11==0)
            {
                nums.remove(nums.get(i));
                i--;
            }

        }
        System.out.println(nums);
    }
}