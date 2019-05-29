package com.example.codetest;

import com.example.codetest.rule.IStrategy;

import java.util.List;

/**
 * Fizz and Buzz game
 * @author Tim Lam
 * @version 2019-05-29
 */
public class Game {

    private int from;
    private int to;
    private IStrategy strategy;

    public Game(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     *
     * @return
     */
    public List<String> start() {
        return strategy.operate(from, to);
    }
}
