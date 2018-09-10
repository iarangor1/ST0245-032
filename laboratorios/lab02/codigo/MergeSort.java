
/**
 * Write a description of class ff here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
import java.util.Scanner;

class MergeSort {
    private static Scanner sc;

    public static void tiempo(){
        for (int i = 100000; i <= 200000; i=i+5000){
            int[] a = new int[i];
            for (int j = 0; j < i; j++ ){
                a[j] = j;
            }
            long start = System.currentTimeMillis();
            mergesort(a);
            long fin = System.currentTimeMillis();       
            System.out.println(fin-start);
        }
    }

    //Solanki, J(2013) Github source code. [Source code].https://gist.github.com/jayeshsolanki93/10404159
    public static void main(String args[]) {
        sc = new Scanner(System.in);

        System.out.println("Enter no of terms");
        int n = sc.nextInt();

        System.out.println("Enter the terms");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("The unsorted array is:");
        System.out.println(Arrays.toString(arr));

        mergesort(arr);

        System.out.println("The sorted array is:");
        System.out.println(Arrays.toString(arr));
    }

    static void mergesort(int arr[]) {
        int n = arr.length;
        if (n < 2)
            return;
        int mid = n / 2;
        int left[] = new int[mid];
        int right[] = new int[n - mid];
        for (int i = 0; i < mid; i++)
            left[i] = arr[i];
        for (int i = mid; i < n; i++)
            right[i - mid] = arr[i];
        mergesort(left);
        mergesort(right);
        merge(arr, left, right);
    }

    public static void merge(int arr[], int left[], int right[]) {
        int nL = left.length;
        int nR = right.length;
        int i = 0, j = 0, k = 0;
        while (i < nL && j < nR) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < nL) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < nR) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
