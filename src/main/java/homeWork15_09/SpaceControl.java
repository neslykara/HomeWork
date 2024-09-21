package homeWork15_09;

import java.util.Scanner;

public class SpaceControl
{
    public static void main(String[] args)
    {
        // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
        // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen string veri girisi yapiniz");

        String s = input.next();
        System.out.println("s = " + s);
       // boolean spaceControl = s.replaceAll("[^ ]", "").length() == 0;
       // System.out.println(spaceControl);
       // boolean spaceControl = s.contains(" ");
           //     System.out.println(spaceControl);


    }
}
