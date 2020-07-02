//Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
//
//        The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
//
//        You may assume the integer does not contain any leading zero, except the number 0 itself.
//
//        Example 1:
//
//        Input: [1,2,3]
//        Output: [1,2,4]
//        Explanation: The array represents the integer 123.
//        Example 2:
//
//        Input: [4,3,2,1]
//        Output: [4,3,2,2]
//        Explanation: The array represents the integer 4321.

package com.java.easy.array;

public class PlusOne {

    public PlusOne(){}

    public int[] plusOne(int[] digits) {
        for(int index = digits.length - 1; index >= 0; index --){
            if(digits[index] == 9){
                digits[index] = 0;
            }
            else {
                digits[index] += 1;
                return digits;
            }
        }

        // we're here because all the digits are nines
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
