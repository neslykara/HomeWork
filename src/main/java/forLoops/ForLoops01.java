package forLoops;

import java.util.Scanner;

public class ForLoops01
{
     /*
     Odev : Asagidaki sekli for-loop kullanarak çizdiriniz.
          Homework: Draw the following figure using for-loop.
        	*
        	* *
        	* * *
        	* * * *
      */

     public static void main(String[] args)
     {
         Scanner input = new Scanner(System.in);
         System.out.println("Sayısal bir deger giriniz.");

         int num = input.nextInt();

         for (int i = 1; i <= num ; i++)
         {
             for (int j = 1; j <=i ; j++)
             {
                 System.out.print("* ");
             }
             System.out.println();

         }

     }

}
