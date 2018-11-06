import java.io.*;
import java.util.*;

/**

 * Esta clase recibe las coordenadas de un grupo de abejas y retorna las que
se encuentren a 100 metros o menos.

 * @author: Isabella Arango & Juan David Rengifo Castro

 * @version: 23/09/2018/A

 */
public class Project {
    private static final int RADIUS = 6371000;
    public static ArrayList<String> bees = new ArrayList<String>();
    private static ArrayList<Double> latitude = new ArrayList<Double>();
    private static ArrayList<Double> longitud = new ArrayList<Double>();
    private static ArrayList<Double> height = new ArrayList<Double>();
    /** Método main que se encarga de leer el archivo .txt con las coordenadas de las abejas
     *  y pasarlas a un ArrayList tipo String.
     * @see #toDouble()
     * @see #closeBees()
     */
    public static void main (String[] args) throws FileNotFoundException {
        long startTime=System.currentTimeMillis();
        try{
            Scanner input = new Scanner(new File("10abejas.txt"));
            input.useDelimiter(",|\\n");
            while (input.hasNextLine()) {
                if (input.hasNext()) {
                    String next = input.next();
                    bees.add(next);
                } else {
                    input.nextLine();
                }
            }
            toDouble();
            closeBees();
        }catch(IOException e){
            System.out.println("Excepcion leyendo fichero: " + e);
        }

        System.out.println();
        int dataSize=1024*1024;
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memoria máxima: " + runtime.maxMemory()/dataSize + "MB");
        System.out.println("Memoria total: " + runtime.totalMemory()/dataSize + "MB");
        System.out.println("Memoria libre: " + runtime.freeMemory()/dataSize + "MB");
        System.out.println("Memoria usada: " + (runtime.totalMemory() - runtime.freeMemory())/dataSize + "MB");

        long endTime=System.currentTimeMillis()-startTime;
        System.out.println("El tiempo de ejecución es: " + endTime);
    }

    /**
     * Método que pasa las coordenadas del ArrayList tipo String a tres ArrayList tipo double,
     * donde se dividen las coordenadas en latitud, longitud y altura.
     * @see #Main()
     */
    public static void toDouble() {
        for (int i = 0; i<bees.size(); i++) {  
            String s = bees.get(i);
            s = s.substring(0,s.length()-1);
            double n = Double.parseDouble(s);
            if (n<0) {                      
                latitude.add(n);
            } else if (n<7) {         
                longitud.add(n);
            } else {
                height.add(n);
            }
        }
    }

    /**
     * Mètodo que retorna la distancia entre dos coordenadas cardinales.
     * @param lat: latitud de la coordenada 1.
     * @param lat1: latitud de la coordenada 2.
     * @param lon: longitud de la coordenada 1.
     * @param lon1: longitud de la coordenada 2.
     * @return La distancia en tres dos coordenadas cardinales.
     * @see #closeBees().
     */
    public static double Haversine(double lat, double lon, double lat1, double lon1) {
        double d = 2*RADIUS*Math.asin(Math.sqrt(Math.pow(Math.sin(Math.toRadians((lat1-lat)/2.0)),2)+
                    Math.cos(lat1)*Math.cos(lat)*Math.pow(Math.sin(Math.toRadians((lon1-lon)/2)),2)));
        return d;
    }

    /**
     * Mètodo que retorna la distancia pitagorica entre el diferencial de la altura y la distancia de dos coordenadas cardinales.
     * @param dh: distancia entre dos coordenadas cardinales.
     * @param heihgt: diferencial de la altura de dos abejas.
     * @return distancia pitagòrica entre los parametros.
     * @see #closeBees().
     */
    public static double Pitagoras (double dh, double height) {
        double d = Math.sqrt(dh*dh + height*height);
        return d;
    }

    /**
     * Mètodo que imprime las abejas que estan a 100 metros o menos y su respectiva distancia.
     * @see #Pitagoras(dh, height).
     * @see #Haversine(lat, lon, lat1, lon1)
     */
    public static void closeBees (){
        for (int i = 0; i<bees.size()/3; i++){
            for (int j = i; j<bees.size()/3; j++) {
                if(i!=j) {
                    double lat = latitude.get(i);
                    double lon = longitud.get(i);
                    double lat1 = latitude.get(j);
                    double lon1= longitud.get(j);
                    double h = height.get(j) - height.get(i);
                    double dh = Haversine(lat, lon, lat1, lon1);
                    double fd = Pitagoras(dh, h);
                    if(fd<=100) {
                        System.out.println("Bee #: " + i + " and bee #: " + j + " are at "
                            + fd + "m.");
                    }
                }
            }
        }
    }

}