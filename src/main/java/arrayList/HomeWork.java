package arrayList;

import java.util.ArrayList;

public class HomeWork {
    public static void main(String[] args) {
        //Ornek 1:  Bir String ArrayList oluşturun ve “a” içeren elemanlari silin.
        //Example 1: Create a String ArrayList and delete the elements containing “a”.
        ArrayList<String> r = new ArrayList<>();
        r.add("Manisa");
        r.add("Nigde");
        r.add("Tokat");
        r.add("Van");
        System.out.println(r); //[Manisa, Nigde, Tokat, Van]


        //ODEV: Bu soruyu i'yi son index'ten baslatarak ta cozebilirdik.i-- yazmaya gerek kalmazdi. Nasil?

        for (int j = r.size()-1; j >= 0; j--)
        {
            if (r.get(j).contains("a"))
            {
                r.remove(j);
            }
        }
        System.out.println(r);
    }
}
