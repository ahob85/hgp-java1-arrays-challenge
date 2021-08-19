
/**
 * Write a description of class ArraysChallenge here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArraysChallenge
{
    /**
     * Given an array of numbers, return true if 6 appears as either the first 
     * or last element in the array. The array will be length 1 or more.
     * 
     * Examples:
     * firstLast6([1, 2, 6]) → true
     * firstLast6([6, 1, 2, 3]) → true
     * firstLast6([13, 6, 1, 2, 3]) → false
     */
    public static boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }

    /**
     * Given an array of numbers of odd length, return a new array length 3 
     * containing the elements from the middle of the array. The array length 
     * will be at least 3.
     * 
     * Examples:
     * midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
     * midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
     * midThree([1, 2, 3]) → [1, 2, 3]
     */
    public static int[] midThree(int[] nums) {
        int middleIndex = nums.length / 2;
        return new int[] {nums[middleIndex - 1], nums[middleIndex], nums[middleIndex + 1]};
    }
    
    /**
     * This is slightly more difficult version of the famous FizzBuzz problem 
     * which is sometimes given as a first problem for job interviews. 
     * Consider the series of numbers beginning at start and running up to but 
     * not including end, so for example start=1 and end=5 gives the series 1,
     * 2, 3, 4. Return a new string array containing the string form of these 
     * numbers, except for multiples of 3, use "Fizz" instead of the number, 
     * for multiples of 5 use "Buzz", and for multiples of both 3 and 5 use 
     * "FizzBuzz".
     * 
     * Examples:
     * fizzBuzz(1, 6) → ["1", "2", "Fizz", "4", "Buzz"]
     * fizzBuzz(1, 8) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
     * fizzBuzz(1, 11) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]
     */
    public static String[] fizzBuzz(int start, int end) {
        String[] retArray = new String[end - start];
        int i = 0;
        while(start < end) {
            if(start % 3 == 0 && start % 5 == 0) {
                retArray[i] = "FizzBuzz";
            } else if(start % 3 == 0) {
                retArray[i] = "Fizz";
            } else if(start % 5 == 0) {
                retArray[i] = "Buzz";
            } else {
                retArray[i] = String.valueOf(start);
            }
            start++;
            i++;
        }
        return retArray;
    }

    /**
     * Given an array of positive numbers, return a new array of length 
     * "count" containing the first even numbers from the original array. 
     * The original array will contain at least "count" even numbers.
     * 
     * Examples:
     * copyEvens([3, 2, 4, 5, 8], 2) → [2, 4]
     * copyEvens([3, 2, 4, 5, 8], 3) → [2, 4, 8]
     * copyEvens([6, 1, 2, 4, 5, 8], 3) → [6, 2, 4]
     */
    public static int[] copyEvens(int[] nums, int count) {
        int[] retArray = new int[count];
        int i = 0;
        while(count > 0) {
            if(nums[i] % 2 == 0) {
                retArray[retArray.length - count] = nums[i];
                count--;
            }
            i++;
        }
        return retArray;
    }

    /**
     * Return a new version of the given array (i.e., don't modify the 
     * original) where each zero value in the array is replaced by the largest 
     * odd value to the right of the zero in the array. If there is no odd 
     * value to the right of the zero, leave the zero as a zero.
     * 
     * Examples:
     * zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
     * zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
     * zeroMax([0, 1, 0]) → [1, 1, 0]
     */
    public static int[] zeroMax(int[] nums) {
        int largestOdd = 0;
        int[] retArray = new int[nums.length];
        for(int i = nums.length - 1; i >= 0; i--) {
            if(nums[i] > largestOdd && nums[i] % 2 == 1) {
                largestOdd = nums[i];
            }
            if(nums[i] == 0) {
                retArray[i] = largestOdd;
            } else {
                retArray[i] = nums[i];
            }
        }
        return retArray;
    }
}
