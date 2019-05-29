package com.example.codetest.rule;

import com.example.codetest.uitls.NumberCheckUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * on the stage, if a number is divisable by 3 or has a 3 in it, convert it to Fizz
 * if a number is divisable by 5 or has a 5 in it, convert it to Buzz
 * if a number satisfy above 2 crierias, convert it to FizzBuzz
 * @author Tim Lam
 * @version 2019-05-29
 */
public class StageTwo implements IStrategy {

    @Override
    public List<String> operate(int from, int to) {
        List<String> result = new ArrayList<String>();
        for (int i = from; i <= to; i++) {
            boolean isDivisableOrHas_3 = isDivisableOrHas(i, 3);
            boolean isDivisableOrHas_5 = isDivisableOrHas(i, 5);
            if (isDivisableOrHas_3 && isDivisableOrHas_5) {
                result.add("FizzBuzz");
            } else {
                if (isDivisableOrHas_3) {
                    result.add("Fizz");
                } else if (isDivisableOrHas_5) {
                    result.add("Buzz");
                } else {
                    result.add(i + "");
                }
            }
        }
        return result;
    }

    private boolean isDivisableOrHas(int dividend, int divisor) {
        return NumberCheckUtil.isDivisable(dividend, divisor) || String.valueOf(dividend).contains(divisor + "");
    }
}
