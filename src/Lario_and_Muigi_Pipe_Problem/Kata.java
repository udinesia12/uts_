package Lario_and_Muigi_Pipe_Problem;

/**
 *
 * @author HP
 */
import java.util.Arrays;

public class Kata {
    public static int[] pipeFix(int[] numbers) {
        // Mencari nilai terkecil dan terbesar dari array input
        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();
        
        // Menginisialisasi array baru dengan panjang yang sesuai
        int[] fixedPipes = new int[max - min + 1];
        
        // Mengisi array baru dengan bilangan bulat antara nilai terkecil dan terbesar
        for (int i = min, j = 0; i <= max; i++, j++) {
            fixedPipes[j] = i;
        }
        
        return fixedPipes;
    }
}
