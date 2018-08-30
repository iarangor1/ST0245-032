import java.util.*;

public class p2
{
    private static ArrayList <Integer> nums = new ArrayList<Integer>();
    private static ArrayList <String> patron = new ArrayList<String>();
    private static Scanner s = new Scanner(System.in);
    
    public static void main (String [] args) {
        System.out.println("Ingrese los números deseados.");
        System.out.println("Para invertir los datos presione -1");    
        p2();
        System.out.println(nums.toString());
        System.out.println("Ingrese un entero positivo");
        int n = s.nextInt();
        if (n>0){
            p3(n);
        }
        System.out.println(patron.toString());
    }

    public static void p2 () {    
        int n = 0;
        while (n!=-1){
            n = s.nextInt();
            if (n!=-1) {
                nums.add(0, n);
            }
        }
    }

    public static void p3 (int n) {
        int t = 1;
        String s ="";
        while (t<=n) {
            s += t + ", ";
            patron.add(s);
            t++;
        }
    }
}