
/**
 * Write a description of class taller5 here.
 *
 * @author (Isabella Arango - Juan David Rengifo)
 * @version (a version number or a date)
 */
public class taller5
{
    public static int suma(int[]a){
        int count=0; //c1
        for(int i=0; i<a.length;i++){//c2 + sumc3, i=0 to n
            count+= a[i]; //suma c4, i=o to n-1
        }
        return count;//c5
        // T(n) = c1 + c2 + c3(n+1) + c4n + c5
        // T(n) es O(c3n) Regla de la suma
        //T(n) es O(n) Regla del producto
    }

    public static void main(String[] args){
        for(int i=10000000;i<=30000000;i=i+1000000){
            int []a= new int [i];
            for(int j=i;j<i;j++){
                a[j]=j;
            }
            long start = System.currentTimeMillis();
            suma(a);
            long fin = System.currentTimeMillis();
            System.out.println(fin-start);
        }
    }

    public static void main2(String[] args){
        for(int i=10000;i<=20000;i=i+500){
            int []a= new int [i];
            for(int j=i;j<i;j++){
                a[j]=j;
            }
            long start = System.currentTimeMillis();
            insertionSort(a); 
            long fin = System.currentTimeMillis();
            System.out.println(fin-start);
        }
    }
    
    public static int[] insertionSort(int[]a){
        for(int i=0; i<a.length-1;i++){ //c1 + sumc2, i=0 to n+1
            int min=i; //c3
            for(int j=i+1; j<a.length;j++){//c4 + sumc5, i=0 to n+1
                if(a[j]<a[min]){ //c6*(n(n+1))/2
                    min=j; //c7
                }
            }
            if(min!=i){ //c8*(n+1)/2
                int t= a[min];//c9
                a[min]=a[i];//c10
                a[i]=t;//c11
            }
        }
        return a; //c12
    }
}
