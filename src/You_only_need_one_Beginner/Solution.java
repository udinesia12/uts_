
package You_only_need_one_Beginner;

/**
 *
 * @author HP
 */
public class Solution {

    public static boolean check(Object[] a, Object x) {
        // Mengecek setiap elemen dalam array
        for (Object obj : a) {
            // Jika objek saat ini sama dengan x, mengembalikan true
            if (obj.equals(x)) {
                return true;
            }
        }
        // Jika tidak ditemukan, mengembalikan false
        return false;
    }

}

