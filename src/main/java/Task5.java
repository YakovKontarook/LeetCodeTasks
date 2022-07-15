import java.util.Arrays;

/*
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

        Increment the large integer by one and return the resulting array of digits.

        Input: digits = [1,2,3]
        Output: [1,2,4]
        Explanation: The array represents the integer 123.
        Incrementing by one gives 123 + 1 = 124.
        Thus, the result should be [1,2,4].
*/
public class Task5 {
    public static void main(String[] args) {
        int[] intArray = {9};
        int[] result = plusOne(intArray);
        System.out.println(Arrays.toString(result));
    }

    public static int[] plusOne(int[] digits) {
        int index = digits.length - 1;
        while(digits[index] == 9) {
            index--;
            if (index < 0) {
                digits = new int[digits.length + 1];
                digits[0] = 1;
                break;
            }
        }
        if(index >= 0) {
            digits[index]++;
        }
        return digits;
    }
}
