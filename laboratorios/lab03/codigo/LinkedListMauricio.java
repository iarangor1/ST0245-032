import java.lang.IndexOutOfBoundsException; // Usar esto cuando se salga el índice
// Una lista simplemente enlazada
public class LinkedListMauricio {
    // Campos de la clase
    private Node2 first; //Primer nodo de la lista

    private int size; //Tamaño de la lista
    
    /**
     * Constructor de listas
     */
    public LinkedListMauricio()
    {
        size = 0;
        first = null;
    }

    /**
     * Returns the node at the specified position in this list.
     * @param index - index of the node to return
     * @return the node at the specified position in this list
     * @throws IndexOutOfBoundsException
     */
    public Node2 getNode(int index) throws IndexOutOfBoundsException {

        if (index >= 0 && index < size) {
            Node2 temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        } else {
            throw new IndexOutOfBoundsException();
        }

        /**
         * if(index>=0 && index <size){
        if(index < size/2){
        Node2 temp=first;
        for(int i=0; i<index;i++){
        temp=temp.next;
        }
        return temp;
        } else {
        Node2 temp=last;
        for(int i=size-1;i>=0;i--){
        temp=temp.prev;
        }
        return temp;
        }
        } else {
        throw new IndexOutOfBoundsException();
        }
         */

    }

    /**
     * Returns the element at the specified position in this list.
     * @param index - index of the element to return
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException
     * @see #getNode()
     */
    public int get(int index) throws IndexOutOfBoundsException {
        Node2 temp = getNode(index);
        return temp.data;
    }

    /**
     * Método que retorna el tamaño de la lista.
     * @return el tamaño de la lista
     */
    public int size()
    {
        return size;
    }

    /**
     * Método que inserta un nuevo elemento a la lista en una posición determinada
     * @param data: Valor del elemento a insertar.
     * @param index: posición (índice) donde se insertará el elemento.
     * @see Laboratorio3#main()
     */
    public void insert(int data, int index)
    {
        if (first==null){
            first = new Node2(data);
        } else if (index >= 0 && index < size) {
            Node2 nuevo= new Node2(data);
            if(index!=0){
                Node2 visited = first;
                
                for(int i=0; i<index-1; i++){ 
                    Node2 temp= visited;
                    visited=visited.next;
                    visited.prev=temp;
                }

                nuevo.next=visited.next;
                nuevo.prev=visited;
                visited.next=nuevo;
                
            } else {
                nuevo.next=first;
                first.prev=nuevo;
                first=nuevo;
            }

        }
        size++;
    }

    /**
     * Método que elimina un elemento de la lista en la posición deseada
     * @param index: posición del elemento a eliminar.
     * @see Laboratorio3#main()
     */
    public void remove(int index)
    {
        if(index>=0 && index<size){
            Node2 visited= first;
            if(index!=0){

                for(int i=0; i<index-1;i++){
                    visited= visited.next;
                }
                Node2 temp = visited.next;
                visited.next=temp.next;
                visited.next.prev=visited;
            } else {
                Node2 temp= visited.next;
                visited=temp;
                visited.next=temp.next;
                first=visited;
                first.prev=null;
            }
        }
        size--;
    }

    /**
     * Método que retorna mensaje en forma de String que le notifica al usuario si el elemento a buscar se
     * encuentra en la lista. En el caso de que se encuentre, además se informará su respectiva posición.
     * @param data: dato a buscar.
     * @return un mensaje en forma de String que le notifica al usuario si el elemento a buscar se
     * encuentra en la lista. En el caso de que se encuentre, además se informará su respectiva posición.
     */
    public String buscar(int data){
        Node2 visited = first;
        int count=0;
        while(visited!=null){
            if(visited.data==data){
                return "El elemento esta en la posición: " + count;
            }
            count++;
            visited = visited.next;
        }
        return "El elemento no está en la lista";
    }
    
    /**
     * Método que verifica si un elemento se encuentra en la lista.
     * @param data: valor de elemento a buscar.
     * @return booleano que comunica si un elemento se encuentra en la lista.
     * @see Laboratorio3#main()
     */
    public boolean contains(int data)
    {
        Node2 visited=first;
        while(visited!=null){
            if(visited.data==data){
                return true;
            }
            visited = visited.next;
        }
        return false;
    }

    /**
     * Método que imprime la lista
     * @see Laboratorio3#main()
     */
    public void imprimir(){
        Node2 visited=first;
        for(int i=0; i<size;i++){
            System.out.println(visited.data);
            visited=visited.next;
        }
    }

}