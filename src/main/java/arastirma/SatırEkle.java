package arastirma;

public class SatırEkle
{
    //Aciklama: Bu kodda, nextInt() çağrısından sonra nextLine() hemen çağrılır.
    // Ancak, kullanıcının yaşını girdikten sonra Enter tuşuna basmasıyla oluşan
    // yeni satır karakteri (\n) girdi akışında kalır. nextInt() yalnızca sayısal değeri okur
    // ve yeni satır karakterini okumaz(akista kalir). Bu yüzden, program nextLine()'a ulaştığında,
    // hâlâ okunmamış bir yeni satır karakteri bulur ve bunu boş bir satır olarak yorumlar,
    // böylece kullanıcıdan adını almak için beklemeksizin hemen ilerler.

        /*Bu sorunu çözmenin yaygın bir yolu, sayısal girdi aldıktan sonra bir nextLine() çağrısı
        ekleyerek kalan yeni satır karakterini temizlemektir*/

    //ARASTIRMA ODEVI:Yeni Satir Karakteri (‘\n’) hatasini duzeltmenin baska yollari var mi?
}
