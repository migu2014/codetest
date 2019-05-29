package com.example.codetest.rule;

import java.util.List;

/**
 * @author Tim Lam
 * @version 2019-05-29
 */
public interface IStrategy {

    public List<String> operate(int from, int to);
}
