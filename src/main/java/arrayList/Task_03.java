package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task_03
{
    /* TASK :
     * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
     * 8. elemaninin yerlerini degistirin.
     *
     * ORNEK:
     *
     * INPUT : String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
     * OUTPUT : String[] isimler={"Umit","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
     */

    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"));
        System.out.println(names);
        String sakla = names.get(2);
        names.set(2, names.get(7));
        names.set(7, sakla);
        System.out.println(names);

    }
}
