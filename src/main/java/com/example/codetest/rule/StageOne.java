package com.example.codetest.rule;

import com.example.codetest.uitls.NumberCheckUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * on the stage, if a number is divisable by 3 and 5, convert to FizzBuzz
 * if it is divisable only by 3, convert to Fizz
 * if it is divisable only by 5, convert to Buzz
 * @author Tim Lam
 * @version 2019-05-29
 */
public class StageOne implements IStrategy {

    /**
     *
     * @param from
     * @param to
     * @return
     */
    public List<String> operate(int from, int to) {
        List<String> result = new ArrayList<String>();
        for (int i = from; i <= to; i++) {
            boolean isDivisableBy_3 = NumberCheckUtil.isDivisable(i, 3);
            boolean isDivisableBy_5 = NumberCheckUtil.isDivisable(i, 5);
            if (isDivisableBy_3 && isDivisableBy_5) {
                result.add("FizzBuzz");
            } else {
                if (isDivisableBy_3) {
                    result.add("Fizz");
                } else if (isDivisableBy_5) {
                    result.add("Buzz");
                } else {
                    result.add(String.valueOf(i));
                }
            }
        }
        return result;
    }
}
