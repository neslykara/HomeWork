package homeWork15_09;

public class Controlxyz
{
    public static void main(String[] args)
    {
        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

        String s = "acxyz12";
        String xyz = "xyz";


       boolean control = s.replaceAll("[^x ^y  ^z ]", " ").trim().equals(xyz);
        System.out.println("control = " + control);
    }
}
