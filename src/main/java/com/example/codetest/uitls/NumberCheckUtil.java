package com.example.codetest.uitls;

/**
 * check a number whether match a rule or not
 * @author Tim Lam
 * @version 2019-05-29
 */
public class NumberCheckUtil {

    /**
     * check a number can be divide by a certain number
     * @param dividend
     * @param divisor
     * @return
     */
    public static boolean isDivisable(int dividend, int divisor) {
        if (divisor == 0) {
            throw new RuntimeException("divisor can not be 0");
        }
        return dividend % divisor == 0;
    }

    /**
     * check a number can be divide by some certain numbers at the same time
     * @param dividend
     * @param divisors
     * @return
     */
    public static boolean isDivisable(int dividend, int... divisors) {
        boolean flag = true;
        for (int divisor : divisors) {
            if (!isDivisable(dividend, divisor)) {
                flag = false;
                break;
            }
        }
        return flag;
    }

}
