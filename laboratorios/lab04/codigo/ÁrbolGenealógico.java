import java.util.Arrays;

public class ÁrbolGenealógico <T extends Comparable<Familiar>>
{
    private Familiar data = null;

    private ÁrbolGenealógico izq, der, padre;

    public void insertar(Familiar fam) {
        insertar1(fam, null);
    }
    
    private void insertar1(Familiar empl,ÁrbolGenealógico padre) {
        if (data == null) {
            this.data = empl;
            this.padre = padre;
        } else {
            if(empl.compareTo(data) < 0) {
                if (izq == null) {
                    izq = new ÁrbolGenealógico();
                }
                izq.insertar1(empl, this);
            } else if (empl.compareTo(data) > 0) {
                if (der == null) {
                    der = new ÁrbolGenealógico();
                }
                der.insertar1(empl, this);
            } else {
                System.out.println("No se puede");
            }
        }
    }

    public Familiar obtener(int id) {
        if (data!= null) {
            if (id == data.getId()) {
                return data;
            } else if(id < data.getId() && izq != null ) {
                return izq.obtener(id);
            } else if (der != null) {
                return der.obtener(id);
            }
        }
        return null;
    }

    public Familiar abuelaM () {
        if (data != null && izq != null && izq.izq != null){
            return izq.izq.data;
        }
        return null;
    }

    public void inorden() {
        inorden1("");
    }

    private void inorden1(String prefijo) {
        if(data != null) {
            if (izq != null) izq.inorden1(prefijo + "  ");
            System.out.println(prefijo + data);
            if (der != null) der.inorden1(prefijo + "  ");
        }
    }
    
    /**
     * Respuestas parcial
     * 2. a) 
     * 4.3 d)
     * 4.4 a)
     * 7.1 1.
     * 7.2. 2.
     * 8. (b)
     * 9. (a)
     * 10. (a) Si
     */
}
