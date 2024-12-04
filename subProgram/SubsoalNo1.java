import java.util.Scanner;
public class SubsoalNo1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.print("Masukkan nilai N: ");
        int n = scn.nextInt();
        System.out.print("Masukkan nilai R: ");
        int r = scn.nextInt();
        //percabangan isi memori n r
        if (r > n) {
            System.out.println("Eror. Input tidak sesuai");
        } else {
            int hasil = combination (n, r);
            System.out.println("Jumlah kombinasi: " + hasil);
        }
    }
    //mendeklasi metode privat
    public static int faktorial (int n) {
        int hasil = 1;
        for (int i = 1; i <= n; i++) { //faktorial isi memori n
            hasil = hasil * i;
        }
        return hasil;
    }
    //mendeklasi metode privat
    public static int combination (int n, int r) {
        if (r > n) {
            return 0;
        }
        return faktorial(n) / (faktorial(r) * faktorial(n - r)); //hasil kombinasi
    }
}
