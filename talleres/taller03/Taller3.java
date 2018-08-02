
/**
 * Write a description of class Taller3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Taller3 {

    /**
     *
     * El método torresDeHannoi es un auxiliar del proceso 
     * @param n numero de discos
     * 
     */	

    public static void torresDeHannoi(int n) {
        torresDeHannoiAux(n, 1, 2, 3);
    }

    /**
     *
     * El método torresDeHannoi es un auxiliar del proceso 
     * @param n numero de discos
     * @param origen la torre número uno donde se posicionan todos los discos inicialmente
     * @param destino la torre donde deben posicionarse todos los discos terminado el proceso
     * @param intermedio torre auxiliar para que el cambio de torres se haga efectivo
     * 
     * debe devolver la secuencia de pasos en consola de esta manera:
     * System.out.println("Disk "+ n + " from "+ origen + " to "+ destino);
     *
     * @see <a href="http://www.uterra.com/juegos/torre_hanoi.php"> Simulación del funcionamiento</a>
     * @see <a href="https://es.wikipedia.org/wiki/Torres_de_Han%C3%B3i"> Un poco de historia </a>
     */	

    private static void torresDeHannoiAux(int n, int origen, int intermedio, int destino) {
        if(n==1){
            System.out.println("Disk " + n + " from " + origen + " to " + destino);
        } else {
            torresDeHannoiAux(n-1, origen, destino, intermedio);
            System.out.println("Disk " + n + " from " + origen + " to " + destino);
            torresDeHannoiAux(n-1, intermedio, origen, destino);
        }
    }

    public static void permutation(String str){
        int r = str.length();
        int n = r;  
        permutationAux(str, "",n,r); 
    }

    private static void permutationAux(String str, String base, int n, int r) {
        if (n == 0) {
            System.out.print(base + " ");
        } else {
            for (int i = 0; i < r; i++) {
                if (base.lastIndexOf(str.charAt(i)) == -1) {
                    permutationAux(str, base + str.charAt(i), n-1, r);
                }
            }
        }
    }
}
