/**
 * Ejercicio 2.1.
 *
 * @author (Isabella Arango - Juan David Rengifo)
 * @version (07 de Octubre del 2018)
 */
import java.util.*;
public class CodigoEnLinea
{
    public static String EjercicioEnLinea(String str){
        LinkedList<String> a = new LinkedList<>();
        boolean b=true;
        int pos=0;
        String resultado="";
        for(int i=0;i<str.length();i++){
            if(str.substring(i,i+1).equals("[")){
                b=true;
                pos=0;
            }
            else if(str.substring(i,i+1).equals("]")){
                b=false;
            }else if(!str.substring(i,i+1).equals("[") && !str.substring(i,i+1).equals("]")){
                if(b){
                    a.add(pos,str.substring(i,i+1));
                    pos++;
                }else{
                    a.add(str.substring(i,i+1));
                }
            }
        }

        for(int i=0;i<a.size();i++){
            resultado+=a.get(i);
        }

        return resultado;
    }
}