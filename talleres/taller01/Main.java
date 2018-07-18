
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main {

    public static void main(String[] args) {
        Contador c = new Contador("Juan");
        Contador c2 = new Contador("Isa");
        for (int i = 0; i < 10; ++i){
            c.incrementar(c2);
        }
        System.out.println(c);
        
        System.out.println();

        Punto p = new Punto(5, 3);
        System.out.printf("Punto: {%f, %f}\n", p.x(), p.y());
        System.out.println("Radio Polar: " + p.radioPolar());
        System.out.println("Angulo Polar: " + Math.toDegrees(p.anguloPolar()));
        System.out.println("Angulo Polar: " + p.distanciaEuclidiana(new Punto(1, 1)));

        System.out.println();

        Fecha f1 = new Fecha(27, 02, 2000);
        Fecha f2 = new Fecha(04, 07, 2018);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f1.comparar(f2));
    }

}
