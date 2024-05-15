package Breaking_chocolate_problem;
public class Chocolate {
    public static long breakChocolate(long n, long m) {
        // Menghitung jumlah potongan cokelat yang dibutuhkan
        // untuk memecahkan seluruh lembaran cokelat
        long totalPieces = (n * m) - 1;
        
        // Mengembalikan jumlah langkah yang diperlukan
        return Math.max(totalPieces, 0);
    }
}
