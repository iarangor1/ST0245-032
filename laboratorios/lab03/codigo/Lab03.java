
/**
 * TÍTULO: Ejercicios laboratorio 3
 *
 * @author Isabella Arango Restrepo y Juan David Rengifo Castro
 * @version 7/10/2018
 */
import java.util.*;
public class Lab03
{
    // Campos de la clase
    private static Node first; // Nodo de la clase Node @See Node#Node()
    static int size; // Tamaño de las listas
    
    /**
     * Constructor de la clase
     */
    public Lab03()
    {
        first=null;  
        size=0;
    }

    /**
     * Método que devuelve una lista enlazada de enteros con un nuevo elemento en la última posición si no se encuentra en la
     * lista original.
     * @param a: define la lista enlazada de enteros sobre la cual se harán o no cambios
     * @param data: define el dato con un posible ingreso a la lista enlazada original.
     * @return La lista enlazada de enteros original con un posible cambio.
     *  @see# main()
     */
    public static LinkedList<Integer> SmartInsert(LinkedList<Integer> a, int data){
        boolean b= a.contains(data);
        if(b==false){
            a.add(data);
            return a;
        } else{
            return a;
        }
    }

    /**
     * Método que devuelve una lista de arreglos de enteros con un nuevo elemento en la última posición si no se encuentra en la
     * lista original.
     * @param a: define la lista de arreglos de enteros sobre la cual se harán o no cambios.
     * @param data: define el dato con un posible ingreso a la lista de arreglos original.
     * @return La lista de arreglos de enteros original con un posible cambio.
     *  @see# main()
     */
    public static ArrayList<Integer> SmartInsert2(ArrayList<Integer> a, int data){
        boolean b= a.contains(data);
        if(b==false){
            a.add(data);
            return a;
        } else {
            return a;
        }
    }

    /**
     * Método que ingresa un valor a una  lista enlazada de enteros en el pivote ideal.
     * @param a: define la lista enlazada de enteros sobre la cual se insertará un nuevo valor.
     * @param data: define el dato ha insertar.
     *  @see# main()
     */
    public static void PosicionOptima(LinkedList<Integer>a, int data){
        System.out.println("La lista es: " + a);
        int count=0;
        for(int i=0; i<=size; i++){
            count+=a.get(i);
        }
        int mitad1=count/2;
        int count2=0; 
        int posmax=0;
        for(int j=0; j<=size; j++){
            count2+=a.get(j);
            if(count2>mitad1){
                posmax=j-1;
                break;
            }
        }
        /*
         * LinkedList<Integer> b = new LinkedList<Integer>();     
        for(int k=0; k<=size+1;k++){
            if(k!=posmax){
                b.add(a.poll());
            } else{
                b.add(data);
            }
        }
         */
        System.out.println("El pivote debe de ir en la posicion: " + posmax);
        //System.out.println("La lista quedaría así: " + b);
    }
    
    
    /**
     * Método que ingresa un valor a una  lista de arreglos de enteros en el pivote ideal.
     * @param b: define la lista arreglos de enteros sobre la cual se insertará un nuevo valor.
     * @param data: define el dato ha insertar.
     * @see# main()
     */
    public static void PosicionOptima2(ArrayList<Integer>b, int data){
        System.out.println("El arreglo es: " + b);
        int count=0;
        for(int i=0;i<b.size();i++){
            count+=b.get(i);
        }
        int mitad1=count/2;
        int count2=0;
        int posmax=0;
        for(int j=0; j<=b.size(); j++){
            count2+=b.get(j);
            if(count2>mitad1){
                posmax=j-1;
                break;
            }
        }
        System.out.println("El pivote debe de ir en la posicion: " + posmax);
    }

    /**
     * Método main donde se crean dos listas (una enlazada y otra de arreglos), las cuales se implementan
     * en todos los métodos de la clase.
     * @see# SmartInsert1()
     * @see# SmartInsert2()
     * @see# PosiciónOptima1()
     * @see# PosiciónOptima2()
     */
    public static void main(String[]args){
        LinkedList<Integer> a = new LinkedList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        for(int i=0; i<10;i++){
            b.add(i);
            a.add(i);
            size++;
        }
        System.out.println("Ejercicio SmartInsert con LinkedList:");
        SmartInsert(a, 3);
        System.out.println(a);
        SmartInsert(a, 20);
        System.out.println(a);

        System.out.println();
        System.out.println("Ejercicio SmartInsert con ArrayList:");
        SmartInsert2(b, 3);
        System.out.println(b);
        SmartInsert2(b, 20);
        System.out.println(b);

        System.out.println();
        System.out.println("Ejercicio calcular pivote máximo con LinkedList");
        PosicionOptima(a, 15);
        
        System.out.println();
        System.out.println("Ejercicio calcular pivote máximo con ArrayList");
        PosicionOptima2(b,15);
    }
}
