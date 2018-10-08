
/**
 * Write a description of class Node2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Node2
{
    // Campos de la clase.
    public int data; // Valor del nodo.
    
    public Node2 next; // Nodo siguiente al nodo en cuestión
    
    public Node2 prev; // Nodo anterior al nodo en cuestión
    
    /**
     * Constructor de nodos
     * @param data Valor del nodo a crear.
     * @see LinkedListMauricio#LinkedListMauricio()
     */
    public Node2(int data){
        this.data= data;
        prev = null;
        next = null;
    }
}
