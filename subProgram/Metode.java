public class Metode {
    
    public static void main(String[] args) {
            
        int hasil7Faktorial;
        hasil7Faktorial = faktorial(7);
        System.out.println("Nilai dari 7 ! adalah "+ hasil7Faktorial);
        System.out.println("Besarnya 10! adalah "+faktorial(10));
    }
    
    static int faktorial(int n) {
        int hasFak=1;
        if (n == 0) return 1;
        else for(int i =1; i<=n; i++) hasFak = hasFak*i;
        return hasFak;
    }
}

