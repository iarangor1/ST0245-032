public class MiArrayList{
    private int [] elements; 
    private int [] copia;

    /**
     * El metodo constructor se utiliza para incializar
     * variables a valores neutros como 0 o null.
     * El contructor no lleva parámetros en este caso.
     */
    public MiArrayList() {
        elements = new int[0];
    }     

    /**
     * Tiene la intención de retornar la longitud del objeto
     * @return longitud del objeto
     *
     * El size esta influenciado por las funciones add y del
     */
    public int size() {
        return elements.length;
    }   

    private void copiar () {
        copia = new int [elements.length]; 
        for (int i = 0; i<elements.length; i++){ 
            copia[i] = elements[i];
        }
    }

    /** 
     * @param e el elemento a guardar
     * Agrega un elemento e a la última posición de la lista
     *
     */
    public void add(int e) {
        copiar();
        elements = new int[elements.length+1]; 
        for(int i=0; i<elements.length-1;i++){ 
            elements[i]=copia[i];
        }
        elements[elements.length-1] = e;
    }

    /** 
     * @param i es un íncide donde se encuentra el elemento posicionado
     * Retorna el elemento que se encuentra en la posición i de la lista.
     *
     */
    private int get1(int i) throws Exception{
        if(i>=0 && i<elements.length){
            return elements[i];
        } else{
            throw new Exception("No es un índice válido.");
        }
    }

    public void get (int n) {
        try {
            System.out.println(get1(n));
        } catch(Exception e) {
            System.out.println("Problema: " + e.getMessage());
        }
    }

    /**
     * @param index es la posicion en la cual se va agregar el elemento
     * @param e el elemento a guardar
     * Agrega un elemento e en la posición index de la lista
     *
     */
    public void addPos(int index, int n) throws Exception {
        if(index<elements.length){
            copiar();
            elements = new int[elements.length+1];
            for(int i = 0; i<index;i++){
                elements[i]= copia[i];
            }
            elements[index]= n;
            for(int j = index;  j<elements.length-1; j++){
                elements[j+1] = copia[j];
            }
        }
    }

    /**
     * @param index es la posicion en la cual se va agregar el elemento
     *
     * ELimina el elemento  en la posición index de la lista
     *
     */
    public void del(int index) throws Exception {
        if(index<elements.length){
            copiar();
            elements = new int[elements.length-1];
            for(int i = 0; i<index;i++){
                elements[i] = copia[i];
            }
            for(int j = index;  j<elements.length-1; j++){
                elements[j] =copia[j+1];
            }
        }
    }
}