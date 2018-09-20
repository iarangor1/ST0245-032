import java.lang.IndexOutOfBoundsException; // Usar esto cuando se salga el índice
// Una lista simplemente enlazada
public class LinkedListMauricio {
    private Node first;
    private int size;
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
    private Node getNode(int index) throws IndexOutOfBoundsException {
        if (index >= 0 && index < size) {
            Node temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /**
     * Returns the element at the specified position in this list.
     * @param index - index of the element to return
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException
     */
    public int get(int index) throws IndexOutOfBoundsException {
        Node temp = getNode(index);
        return temp.data;
    }

    // Retorna el tamaño actual de la lista
    public int size()
    {
        return size;
    }

    // Inserta un dato en la posición index
    public void insert(int data, int index)
    {
        if (first==null){
            first = new Node(data);
        } else if (index >= 0 && index < size) {
            Node nuevo= new Node(data);
            if(index!=0){
                Node visited = first;
                for(int i=0; i<index-1; i++){ 
                    visited=visited.next;
                }

                nuevo.next=visited.next;
                visited.next=nuevo;
            } else {
                nuevo.next=first;
                first=nuevo;
            }

        }

        size++;
    }

    // Borra el dato en la posición index
    public void remove(int index)
    {
        if(index>=0 && index<size){
            Node visited= first;
            if(index!=0){
                
                for(int i=0; i<index-1;i++){
                    visited= visited.next;
                }
                Node temp = visited.next;
                visited.next=temp.next;
            } else {
                Node temp= visited.next;
                visited=temp;
                visited.next=temp.next;
            }
        }
        size++;
    }

    public String buscar(int data){
        Node visited = first;
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
    // Verifica si está un dato en la lista
    public boolean contains(int data)
    {
        Node visited=first;
        while(visited!=null){
            if(visited.data==data){
                return true;
            }
            visited = visited.next;
        }
        return false;
        /**
         * Otra forma es con este metodo:
         * public boolean containsRec(int data, Node temp){
         *     if(temp==null){
         *         return false;
         *         } else {
         *             if(temp.data == data){
         *                 return true;
         *                 } else {
         *                     return containsRec(data, temp.next);
         *                     }
         *             }
         *     }
         *     public boolean containsRec(int data){
         *         return containsRec(data, first);
         *         }
         */
    }

    public void imprimir(){
        Node visited=first;
        for(int i=0; i<size;i++){
            System.out.println(visited.data);
            visited=visited.next;
        }
    }

}
