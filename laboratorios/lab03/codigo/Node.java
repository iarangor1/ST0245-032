public class Node {
    // Campos de la clase.
    public int data; //Valor del nodo
    
    public Node next; // Nodo siguiente
   
    /**
     * Constructor de Nodos
     * @param data: entero que define el valor del nodo creado.
     */
    public Node(int data)
    {
        next = null;
        this.data = data;
    }
}