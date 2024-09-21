package homeWork15_09;

public class NestedTernary {
    public static void main(String[] args) {
        /*
        Final notu tanimlayin, Nested Ternary ile cozunuz
        'A'  ->  "Gayet Basarili"
        'B'  ->  "Basarili"
        'C'  ->   "Ha gayret"
        bu notlar disindakilere de Digerleri.. yazdiriniz
         */

        int examScore = 80;

        String successStatus = (examScore >= 85 && examScore <= 100 ? "Gayet Basarili" : ((examScore >=70 && examScore<85 ) ? "Basarili"
        : ((examScore >= 60 && examScore < 70) ? "Ha gayret" : (examScore >= 50 && examScore < 60 ? "Sınırdasiniz"
                :(examScore >= 0 && examScore <50 ? "Kaldiniz" : "Gecerli bir not giriniz.") ))));
        System.out.println("successStatus = " + successStatus);

    }
}
