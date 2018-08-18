
/**
 * Ejercicios de Codingbat Recursion1 y Recursion2.
 *
 * @author (Isabella Arango - Juan David Rengifo)
 * @version (a version number or a date)
 */
public class Codingbat
{
    /**
     * RECURSION 1
     * changeXY
     * array6
     * stringClean
     * nestParen
     * count8
     */

    public static String changeXY(String str) {
        if(str.length()==0){
            return str;
        } else if(str.charAt(0)=='x'){
            return "y" + changeXY(str.substring(1));
        } else {
            return str.charAt(0) + changeXY(str.substring(1));
        }
    }

    public static boolean array6(int[] nums, int index) {
        if(nums.length==0){
            return false;
        } else if(index== nums.length-1){
            if(nums[index]==6){
                return true;
            } else {
                return false;
            }
        } else if(nums[index]==6){
            return true;
        } else {
            return array6(nums, index+1);
        }
    }

    public static String stringClean(String str) {
        if(str.length()<2){
            return str;
        } else if(str.charAt(0)==str.charAt(1)){
            return stringClean(str.substring(1));
        } else {
            return str.charAt(0) + stringClean(str.substring(1));
        }
    }

    public static boolean nestParen(String str) {
        if(str.equals("") || str.equals("()")){
            return true;
        } else if(str.charAt(0)=='(' && str.charAt(str.length()-1)==')'){
            return nestParen(str.substring(1, str.length() - 1));
        } else{
            return false;
        }
    }

    public static int count8(int n) {
        if(n<10 && n!=8){
            return 0;
        } else if(n%10==8 && (n/10)%10==8){
            return 2 +  count8(n/10);
        } else if(n%10==8){
            return 1 + count8(n/10);
        } else {
            return count8(n/10);
        }
    }

    /**
     * RECURSION 2
     * groupSum6
     * groupNoAdj
     * groupSum5
     * groupSumClump
     * splitArray
     */

    public static boolean groupSum6(int start, int[] nums, int target) {
        if (start >= nums.length){
            if(target==0){
                return true;
            } else {
                return false;
            }
        } else if (nums[start] == 6){
            return groupSum6(start + 1, nums, target - nums[start]);
        } else {
            return groupSum6(start + 1, nums, target - nums[start]) || groupSum6(start + 1, nums, target);
        }
    }

    public static boolean groupNoAdj(int start, int[] nums, int target) {
        if(start>=nums.length){
            return target==0;
        } else {
            return groupNoAdj(start+2, nums, target - nums[start]) || groupNoAdj(start+1, nums,target);
        }
    }

    public static boolean groupSum5(int start, int[] nums, int target) {
        if(start>=nums.length){
            return target==0;
        } else if(nums[start]%5==0){
            if(start<nums.length-1 && nums[start+1]==1){
                return groupSum5(start+2,nums,target-nums[start]);
            } else {
                return groupSum5(start+1,nums,target-nums[start]);
            }
        } else {
            return groupSum5(start+1,nums,target-nums[start]) || groupSum5(start+1,nums,target);
        }
    }

    public static boolean groupSumClump(int start, int[] nums, int target) {
        if(start>=nums.length){
            return target==0;
        } else if(start<nums.length-2 && nums[start]==nums[start+1]){
            return groupSumClump(start+2, nums, target);
        } else {
            return groupSumClump(start+1, nums, target) || groupSumClump(start+1, nums, target-nums[start]);
        }
    }

    public static boolean splitArray(int[] nums) {
        return ayudante(0, nums, 0, 0);
    }

    public static boolean ayudante(int start, int[] nums, int parte1, int parte2){
        if(start>=nums.length){
            return parte1 == parte2;
        } else {
            return ayudante(start+1, nums, parte1+nums[start], parte2) || ayudante(start+1,nums,parte1, parte2+nums[start]);
        }
    }
}
