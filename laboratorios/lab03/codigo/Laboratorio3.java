public class Laboratorio3 {
    
    /**
     * Método main donde se pone a prueba la clase LinkedListMauricio
     * @see LinkedListMauricio#insert()
     * @see LinkedListMauricio#remove()
     * @see LinkedListMauricio#imprimir()
     * @see LinkedListMauricio#contains()
     */
    public static void main(String[] args)
    {
        LinkedListMauricio list = new LinkedListMauricio();

        System.out.println("Insertando elementos:");
        list.insert(5, 0);
        list.insert(4, 0);
        list.insert(3, 0);
        list.insert(2, 0);
        list.insert(1, 0);

        list.insert(6,3);

        list.imprimir();
        System.out.println();
        list.remove(1);
        System.out.println("Despues de borrar el dato en la posicion 1, ¿La lista contiene al numero 3?: ");
        System.out.println(list.contains(3));
        list.imprimir();
        list.remove(2);
        System.out.println("Despues de borrar el dato en la posicion 2, ¿La lista contiene al numero 2?:");
        System.out.println(list.contains(2));
        list.imprimir();
     
    }

}