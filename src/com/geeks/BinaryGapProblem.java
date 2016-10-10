package com.geeks;


/**
 * Created by b_ashish on 10-Oct-16.
 * <p>
 * <p>
 * <p>
 * A binary gap within a positive integer N is any maximal sequence of consecutive zeros
 * that is surrounded by ones at both ends in the binary representation of N.
 * <p>
 * For example, number 9 has binary representation 1001 and contains a binary gap of length 2.
 * The number 529 has binary representation 1000010001 and contains two binary gaps: one of length
 * 4 and one of length 3.
 * The number 20 has binary representation 10100 and contains
 * one binary gap of length 1.
 * The number 15 has binary representation 1111 and has no binary gaps.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int N); }
 * <p>
 * that, given a positive integer N, returns the length of its longest binary gap.
 * The function should return 0 if N doesn't contain a binary gap.
 * <p>
 * For example, given N = 1041 the function should return 5,
 * because N has binary representation 10000010001 and so its longest binary gap is of length 5.
 * <p>
 * Assume that:
 * <p>
 * N is an integer within the range [1..2,147,483,647].
 * <p>
 * Complexity:
 * <p>
 * expected worst-case time complexity is O(log(N));
 * expected worst-case space complexity is O(1).
 */
public class BinaryGapProblem {

    public static void main(String arg[]) {
        System.out.println("\nOutput: " + solution(9));
    }

    /**
     * - N is an integer within the range [1..2,147,483,647].
     * - Returns the length of its longest binary gap
     * - The function should return 0 if N doesn't contain a binary gap.
     *
     * @param N
     * @return
     */
    public static int solution(int N) {
        // calculate binary of a number
        String binary = Integer.toBinaryString(N);
//        String binary = "00001";
        System.out.printf("Binary Representation of %d : %s", N, binary);
        int result = binary.indexOf('0');
        if (result == -1) {
            // no presence of 0 character in binary string so return from here
            return 0;
        }

        int firstIndexOfOne = binary.indexOf('1');

        System.out.println("\nLength: " + binary.length() + "  index of first 1 : " + firstIndexOfOne);
        /**
         * if firstIndexOfOne at last position or in second last position than no need to calculate
         */
        if (firstIndexOfOne == binary.length() - 1 || firstIndexOfOne == binary.length() - 2) {
            return 0;
        }

        // time to find a gaps between 1's
        int highestGap = 0;
        int count = 0;
        int startPos = firstIndexOfOne + 1;
        for (int i = startPos; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                if (count > highestGap) {
                    highestGap = count;
                }
                count = 0;
            } else {
                count++;
            }
        }

        return highestGap;
    }
}
