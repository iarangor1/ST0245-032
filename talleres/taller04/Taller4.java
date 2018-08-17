
/**
 * Write a description of class Taller4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.concurrent.TimeUnit;
public class Taller4
{
    public static void main(String[] args){
        for (int i = 1; i <= 20; i++){
            int[] a = new int[i];
            for (int j = 0; j < i; j++ ){
                a[j] = j;
            }
            long start = System.currentTimeMillis();
            suma(a);
            long fin = System.currentTimeMillis();       
            System.out.println(fin-start);
        }
    }

    public static int suma(int[] a){
        return suma(a, 0);
    }

    private static int suma(int[] a, int i){
        if (i == a.length)
            return 0;
        else{
            try{
                TimeUnit.SECONDS.sleep(1);
            } catch(Exception e){
            }
            return a[i] + suma(a,i+1);
        }
    }

    public static void main2(){
        for (int i = 1; i <= 20; i++){
            int[] a = new int[i];
            for (int j = 0; j < i; j++ ){
                a[j] = j;
            }
            long start = System.currentTimeMillis();
            Gs(a);
            long fin = System.currentTimeMillis();       
            System.out.println(fin-start);
        }
    }
    
    public static boolean Gs(int[] a){
        return groupSum(0, a, 10); 
    }

    public static boolean groupSum(int start, int[] nums, int target) {
        if(start>=nums.length){
            return target==0;
        } else if(nums[start]==6){
            try{
                TimeUnit.SECONDS.sleep(1);
            } catch(Exception e){
            }
            return groupSum(start+1, nums, target-nums[start]);
        } else {
            try{
                TimeUnit.SECONDS.sleep(1);
            } catch(Exception e){
            }
            return groupSum(start+1, nums, target);
        }
    }

}
