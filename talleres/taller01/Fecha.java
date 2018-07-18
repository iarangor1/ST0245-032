
/**
 * Write a description of class Fecha here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fecha {

    private final int dia;
    private final int mes;
    private final int anyo;

    /**
     * Se inicializan las variables globales en el constructor de manera que no posean valores nulos o 0s.
     */
    public Fecha(int dia, int mes, int anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }

    /**
     * Método para obtener la variable global dia.
     *
     * @return el dia
     */
    public int dia() {
        return dia;
    }

    /**
     * Método para obtener la variable global mes.
     *
     * @return el mes
     */
    public int mes() {
        return mes;
    }

    /**
     * Método para obtener la variable global anio.
     *
     * @return el año
     */
    public int anio() {
        return anyo;
    }

    /**
     * @param otra representa la fecha con la culase va a comparar.
     *
     * El método comprar se encarga de devolvernos respuesta a tres posibilidades.
     * 1: si la fecha es menor que la otra retorna -1.
     * 2: si la fecha es igual que la otra retorna 0.
     * 3: si la fecha es mayor que la otra retorna 1.
     *
     * @return -1 sí es menor; 0 sí es igual; 1 sí es mayor.
     *
     */

    public int comparar(Fecha otra){
        if(anyo==otra.anyo) {
            if (mes==otra.mes) {
                if (dia==otra.dia) {
                    return 0;
                } else if (dia>otra.dia) {
                    return 1;
                } else {
                    return -1;
                }
            } else if (mes>otra.mes) {
                return 1;
            } else {
                return -1;
            }
        } else if (anyo>otra.anyo){
            return 1;
        } else {
            return -1;
        }
    }

    /**
     * toString se encargará de convertir el tipo abstracto fecha en un tipo cadena
     * para su posterior visualización
     *
     * @return una cadena que contiene la fecha
     */
    public String toString() {
        String s = dia + "/" + mes + "/" + anyo;
        return s;
    }
}