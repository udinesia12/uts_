package KeepHydrated;

import java.util.Arrays;

public class Kata {
    public static int[] pipeFix(int[] numbers) {
        int min = Arrays.stream(numbers).min().getAsInt(); // mencari nilai terkecil
        int max = Arrays.stream(numbers).max().getAsInt(); // mencari nilai terbesar
        
        // Menginisialisasi array baru dengan panjang yang sesuai
        int[] fixedPipes = new int[max - min + 1];
        
        // Mengisi array baru dengan bilangan bulat antara nilai terkecil dan terbesar
        for (int i = min, j = 0; i <= max; i++, j++) {
            fixedPipes[j] = i;
        }
        
        return fixedPipes;
    }

    
}
