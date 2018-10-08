public class Nevera
{
    // Campos de la clase
    private int codigo; // Código de la nevera
    
    private String descripcion; // Descripción de la nevera
    
    /**
     * Constructor de Neveras.
     * @param codigo: entero que define el codigo de una nevera
     * @param descripción: String que define la descripción de una nevera.
     */
    public Nevera(int codigo, String descripcion){
        this.codigo = codigo;
        this.descripcion = descripcion;
    }
    
    /**
     * Método getter que retorna el código de una nevera.
     * @return entero que define el código de una nevera.
     * @see Almacen#atenderSolicitud()
     */
    public int getCodigo(){
        return codigo;
    }

    /**
     * Método getter que retorna la descripción de una nevera.
     * @return String que define la descripción de una nevera.
     * @see Almacen#atenderSolicitud()
     */
    public String getDescripcion(){
        return descripcion;
    }	
}