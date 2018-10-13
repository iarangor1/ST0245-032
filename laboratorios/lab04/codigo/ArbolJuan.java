import java.util.Arrays;

public class ArbolJuan
{
    public static void main (String [] args) {
        Familiar Juan = new Familiar("Juan David", true, 18, 100);     
        //Primera generación
        Familiar Papi = new Familiar("Luis Eduardo", true, 57, 150);
        Familiar Mami = new Familiar("Johana", true, 50, 50);
        //Segunda generación Edad A@P
        Familiar AoM = new Familiar("Gerardo", false, 0, 75);
        Familiar AaM = new Familiar("Carmenza", false, 0, 25);
        Familiar AoP = new Familiar("Luis Eduardo", true, 82, 175);
        Familiar AaP = new Familiar("Dina", true, 73, 125);
        //Tercera generación
        Familiar BoMM = new Familiar("Joaquín", false, 0, 30);
        Familiar BaMM = new Familiar("Cornelia", false, 0, 20);
        Familiar BoMP = new Familiar("Gerardo", false, 0, 80);
        Familiar BaMP = new Familiar("Elsa", false, 0, 70);
        //Nombres
        Familiar BoPM = new Familiar("Luis", false, 0, 130);
        Familiar BaPM = new Familiar("Matilde", false, 0, 120);
        Familiar BoPP = new Familiar("Eduardo", false, 0, 180);
        Familiar BaPP = new Familiar("Luisa", false, 0, 170);

        ÁrbolGenealógico AG = new ÁrbolGenealógico();
        Arrays.asList(Juan, Papi, Mami, AoM, AaM, AoP, AaP, BoMM, BaMM, BoMP,
            BaMP, BoPM, BaPM, BoPP, BaPP).forEach(AG::insertar);
        AG.inorden();
        System.out.println();
        System.out.println("Abuela Materna");
        System.out.println(AG.abuelaM());
    }
}
