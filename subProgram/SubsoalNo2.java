import java.util.Scanner;
public class SubsoalNo2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.print("Masukkan nilai N: ");
        int n  = scn.nextInt();

        //mencetak baris kebawah
        for (int i = 0; i <= n; i++) { //loop untuk memori n
            for (int j = 0; j < n - i; j++) { //untuk mencetak spasi
                System.out.print(" ");
            }
            int kombinasi = 1;
            System.out.print(kombinasi+ " ");

            //untuk cetak kesamping
           for (int r = 1; r <= i; r++) { //loop untuk mencetak kombinasi
            System.out.print(Cnr(i, r)+ " ");
           }
           System.out.println();
        }
    }
    //mendeklarsi metode privat untuk menghitng faktorial
    static long faktorial (int n) {
        int nFak = 1;
        if (n == 0) nFak = 1; 
        else for (int i = 1; i <= n; i++) nFak *= i; //loop menghitung faktorial
        return nFak; //mengembalikan nilai faktorial
    }
    //mendeklasi metode privat
    static long Cnr (int n, int r) {
        return faktorial(n) / (faktorial(n - r) * faktorial(r)); //mencari kombinasi
    }
}   
