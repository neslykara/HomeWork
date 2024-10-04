package arrays;

public class Task08
{
    /*
 TASK :
 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.

      String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
      */

    public static void main(String[] args) {
        String s = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        String[] str =s.split(" ");
        int total1 = 0;
        int total2 = 0;


        for (String w: str)
        {
            if (w.contains("$")){
              total1 =total1 + Integer.valueOf(w.replace("$",""));
            } else if (w.contains("£")) {
              total2 =total2 + Integer.valueOf(w.replace("£",""));
            }
        }
        System.out.println("toplam $ = "+total1);
        System.out.println("toplam £ = "+total2);

    }
}

