package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_07
{
    /*
Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
1-1-2-3-5-8-13-21-34....
*/
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(1);
        fibonacci.add(1);

        System.out.println("Bir tamsayi giriniz");
        int sayi = scan.nextInt();

        while (true)
        {
            int sum = 0;
            for (int i = fibonacci.size()-2 ; i <=fibonacci.size()-1 ; i++)
            {
                sum = sum + fibonacci.get(i);
            }
            fibonacci.add(sum);

            if (fibonacci.get(fibonacci.size()-1)>=sayi)
            {
                fibonacci.remove(fibonacci.size()-1);
                break;
            }
        }
        System.out.println(fibonacci);





    }
}
