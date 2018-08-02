
/**
 * Write a description of class Jd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;

class PuntosOpcionales {
    public static void Punto3(String str) {              
        int r = str.length();
        int n = r;   
        Punto3Aux(str, "", n, r);
    }

    private static void Punto3Aux(String str, String base, int n, int r) {
        if (n == 0) {
            System.out.print(base + " ");
        } else {
            for (int i = 0; i < r; i++) {
                Punto3Aux(str, base + str.charAt(i), n-1, r);
            }
        }
    }
}
