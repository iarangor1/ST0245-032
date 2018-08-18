
/**
 * Ejercico 1.1.
 *
 * @author (Isabella Arango - Juan David Rengifo)
 * @version (20/07/2018)
 */
public class Punto1 
{
    public static int Fibonacci(int n){
        if(n==0){
            return 0;
        } else if (n==1||n==2){
            return 1;
        } else {
            return Fibonacci(n-1) + Fibonacci(n-2);
        }
    }
}
