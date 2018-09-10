
/**
 * Write a description of class Punto1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Punto1
{
    public static int[] doInsertionSort(int[] input){
        // JAVA2NOVICE.com source code [Source code].http://www.java2novice.com/java-sorting-algorithms/insertion-sort/
        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }

    public static void main(String[] args){
        for (int i = 100000; i <= 200000; i=i+5000){
            int[] a = new int[i];
            for (int j = 0; j < i; j++ ){
                a[j] = j;
            }
            long start = System.currentTimeMillis();
            doInsertionSort(a);
            long fin = System.currentTimeMillis();       
            System.out.println(fin-start);
        }
    }
}