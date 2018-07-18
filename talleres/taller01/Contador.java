
/**
 * Write a description of class Contador here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Contador {

    private int cuenta=0;
    private final String id;

    /**
     * Se inicializan las variables globales en el constructor de manera que no posean valores nulos o 0s.
     */
    public Contador(String id) {
        this.id=id;
    }

    /**
     * El método incrementar incrementa el contador en una unidad.
     *
     *(opcional: se podria pasar un parametro "cantidad" para incrementar esa cantidad de unidades).
     */
    public void incrementar(Contador otroID) {
        if(id!=otroID.id){
            this.cuenta++;
        }
    }

    /*
    Se podría implementar un metodo decrementar para hacer la operacion inversa de incrementar.
     */

    /**
     * El método incrementos nos muestra en que valor se encuentra la cuenta actualmente.
     * @return el numero actual de la cuenta
     */
    public int incrementos() {
        return this.cuenta;
    }

    /**
     * toString se encargará de convertir el contador en un tipo cadena
     * para su posterior visualización
     * se debe de mostrar el estado del contador y su id
     *
     * @return una cadena que contiene el id del contador y su cuenta
     */
    public String toString() {
        return "Los incrementos en el contador son de: " + this.cuenta;
    }
}