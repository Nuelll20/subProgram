import java.util.Scanner;
public class SubsoalNo3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double x1 = bacaAbsis (); double y1 = bacaOrdinat ();
        double x2 = bacaAbsis (); double y2 = bacaOrdinat ();
        double x3 = bacaAbsis (); double y3 = bacaOrdinat ();

       double a, b, c;
       a = jarak2Titik (x1, y1, x2, y2);
       b = jarak2Titik (x2, y2, x3, y3);
       c = jarak2Titik (x3, y3, x1, y1);

       double keliling;
       keliling = a + b + c;

       double sisi = keliling / 2;
       double luas = Math.sqrt (sisi * (sisi - a) * (sisi - b) * (sisi - c));
       System.out.println("Keliling dari Segitiga adalah: " + keliling);
       System.out.println("Luas dari Segitiga adalah: " + luas);
    }
    public static double bacaAbsis() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Masukkan Absis\t: ");
        double absis = scn.nextDouble();
        return absis;
    }
    public static double bacaOrdinat() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Masukkan Ordinat: ");
        double ordinat = scn.nextDouble();
        return ordinat;
    }
    public static double jarak2Titik(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}
