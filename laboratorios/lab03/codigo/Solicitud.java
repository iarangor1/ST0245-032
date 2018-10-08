public class Solicitud
{
    // Campos de la clase
    private String nombre; //Nombre de la empresa
    
    private int cantidad; //Cantidad de neveras
    
    /**
     * Constructor de la solicitud de compra de neveras por parte de una empresa.
     * @param cantidad: número de neveras solicitadas.
     * @param nombre: nombre de la empresa
     */
    public Solicitud(int cantidad,String nombre){
        this.cantidad = cantidad;
        this.nombre = nombre;
    }

    /**
     * Método getter que retorna la cantidad de neveras solicitadas.
     * @return entero que define la cantidad de neveras solicitadas.
     * @see Almacen#atenderSolicitud()
     */
    public int getCantidad(){
        return cantidad;
    }

    /**
     * Método getter que retorna el nombre de la empresa que generó la solicitud.
     * @return String que define el nombre de la empresa que generó la solicitud.
     * @see Almacen#atenderSolicitud()
     */
    public String getNombre(){
        return nombre;
    }	
}