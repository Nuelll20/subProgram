public class pyhtagoras {
    public static void main(String[] args) {
        double simir = pitagoras (6,8);
        System.out.println("Sisi miring dari a = 6 dan b = 8 adalah: "+simir);

        double simir1 = pitagoras(10, 5);
        System.out.println("Sisi miring dari a = 10 dan b = 5 adalah: "+simir1);

    }   
    static double pitagoras (double a , double b) {
        double hasil;
        hasil = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return hasil;
    }
    
}
