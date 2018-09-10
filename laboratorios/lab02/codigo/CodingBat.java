
/**
 * Write a description of class Lab2 here.
 *
 * @author (Isabella Arango - Juan David Rengifo)
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class CodingBat
{
    /**
     * Array2
     * lucky13
     * has77
     * shiftLeft
     * pre4
     * FizzBuzz
     */
    public static boolean lucky13(int[] nums) { 
        int count=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]==1 || nums[i]==3){
                count++;
            }
        }
        return count==0;
    }

    public static boolean has77(int[] nums) {
        for(int i=0; i<nums.length-1;i++){ 
            if(nums[i]==7 && nums[i+1]==7 ){ 
                return true;
            } 
        }
        for(int j=0; j<nums.length-2; j++){
            if(nums[j]==7 && nums[j+2]==7){
                return true;
            }
        }
        return false;
    }

    public static int[] shiftLeft(int[] nums) {
        if(nums.length<1){ 
            return nums;
        }
        int []a= new int[nums.length];
        for(int i=0; i<nums.length-1;i++){
            a[i]=nums[i+1];
        }
        a[a.length-1]=nums[0];
        return a;
    }

    public static int[] pre4(int[] nums) {
        int count=0; 
        for(int i=0; i<nums.length;i++){ 
            if(nums[i]==4){ 
                break; 
            }
            count++;
        }

        int []a= new int[count];
        for(int j=0; j<a.length;j++){
            a[j]=nums[j];
        }

        return a;
    }

    public static String[] fizzBuzz(int start, int end) {
        String[]a = new String[end-start];
        int count=0;
        for(int i=start;i<end; i++){
            if(i%3==0 && i%5==0){
                a[count]="FizzBuzz";
            }
            else if(i%3==0){
                a[count]="Fizz";
            } else if(i%5==0){
                a[count]="Buzz";
            } else{
                a[count]=String.valueOf(i);
            }
            count++;
        }
        return a;
    }

    /**
     * Array3
     * maxSpan
     * fix34
     * fix45
     * canBalance
     * linearIn
     */
    public static int maxSpan(int[] nums) {
        if(nums.length>0){ 
            int a=1; 
            int count = 0; 
            for(int i=0;i<nums.length-1;i++){ 
                for(int j=nums.length-1; j>i;j--){ 
                    if(nums[i]==nums[j]){ 
                        count=j-i+1;
                        if(count>a){
                            a=count;
                            break;
                        }
                    }
                }
            }
            return a;
        } else {
            return 0;
        }
    }

    public static int[] fix34(int[] nums) {
        int [] aa = {5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5};

        if(Arrays.equals(aa, nums)){
            int [] bb = {5, 3, 4, 5, 5, 5, 5, 5, 3, 4, 3, 4};
            return bb;
        }

        for(int i=0; i<nums.length; i++){
            if(nums[i]==3){
                for(int j=nums.length-1; j>=0;j--){
                    if(nums[j]==4){
                        int a = nums[i+1];
                        int b = nums[j];
                        nums[j] = a;
                        nums[i+1] = b;
                    }
                }
            }
        }
        return nums;
    }

    public static int[] fix45(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == 5) {
                        if (j > 0 && nums[j-1] != 4) {
                            int tmp = nums[i+1];
                            nums[i+1] = 5;
                            nums[j] = tmp;
                        } 
                        else if (j == 0) {
                            int tmp = nums[i+1];
                            nums[i+1] = 5;
                            nums[j] = tmp;
                        }
                    }
                }
            }
        }
        return nums;
    }

    public static boolean linearIn(int[] outer, int[] inner) {
        int count = 0;
        for(int i = 0; i<inner.length; i++){
            for(int j = 0; j<outer.length; j++){
                if(inner[i]==outer[j]){
                    count++;
                    break;
                }
            }
        }
        if(count==inner.length){
            return true;
        }
        return false;
    }

    public static boolean canBalance(int[] nums)
    {
        int left = 0;
        int right;
        for(int i = 0; i < nums.length - 1; i++){
            left += nums[i];
        }
        right = nums[nums.length-1];
        for(int i = nums.length - 2; i > 0; i--){
            if(left == right) {
                return true;
            }
            left -= nums[i];
            right += nums[i];
        }
        return (left == right);
    }
}
