import java.io.*;
import java.util.*;

public class Project {
    private static final int RADIUS = 6371000;
    public static ArrayList<String> bees = new ArrayList<String>();
    private static ArrayList<Double> latitude = new ArrayList<Double>();
    private static ArrayList<Double> longitud = new ArrayList<Double>();
    private static ArrayList<Double> height = new ArrayList<Double>();

    public static void main (String[] args) throws FileNotFoundException {
        try{
            Scanner input = new Scanner(new File("coordenadas.txt"));
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
    }

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

    public static double Haversine(double lat, double lon, double lat1, double lon1) {
        double d = 2*RADIUS*Math.asin(Math.sqrt(Math.pow(Math.sin(Math.toRadians((lat1-lat)/2.0)),2)+
                    Math.cos(lat1)*Math.cos(lat)*Math.pow(Math.sin(Math.toRadians((lon1-lon)/2)),2)));
        return d;
    }

    public static double Pitagoras (double dh, double height) {
        double d = Math.sqrt(dh*dh + height*height);
        return d;
    }

    public static void closeBees (){
        for (int i = 0; i<bees.size()/3; i++){
            for (int j = 0; j<bees.size()/3; j++) {
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