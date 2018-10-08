import java.util.*;
public class Almacen
{
    static Stack<Nevera> neveras=new Stack<>(); //
    static Queue<Solicitud> solicitudes=new LinkedList<Solicitud>(); // Fila de Solicitud de neveras

    public static void agregarNevera (Nevera nevera){
        neveras.push(nevera);
    }

    public static void agregarSolicitud (Solicitud solicitud){
        solicitudes.add(solicitud);	
    }

    public static void atenderSolicitud(){
        int size=solicitudes.size();
        for(int i = 0; i < size; i++){
            Solicitud solicitud= solicitudes.remove();
            int cantidad=solicitud.getCantidad();
            System.out.print("Empresa " + solicitud.getNombre() + " :");
            while(cantidad !=0 && neveras.size() != 0){
                Nevera temp= neveras.pop();
                System.out.print(" nevera con código:"+temp.getCodigo()+"-"+temp.getDescripcion()+",");
                cantidad--;
            }
            System.out.println();
            if(neveras.size() == 0){
                System.out.println("Se acabaron las neveras");
                break;
            }

        }

    }

}