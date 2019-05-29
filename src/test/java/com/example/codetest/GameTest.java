package com.example.codetest;

import com.example.codetest.rule.StageOne;
import com.example.codetest.rule.StageTwo;
import junit.framework.TestCase;

import java.util.List;

/**
 * test a game with different rules
 * @author Tim Lam
 * @version 2019-05-29
 */
public class GameTest extends TestCase {

//    private Game game = new Game(1, 1);
//    private Game game = new Game(100, 100);
    private Game game = new Game(1, 20);
//    private Game game = new Game(1, 100);

    public void testStageOne() {
        StageOne s = new StageOne();
        game.setStrategy(s);
        List<String> result = game.start();
        result.stream().forEach(System.out::println);
    }

    public void testStageTwo() {
        StageTwo s = new StageTwo();
        game.setStrategy(s);
        List<String> result = game.start();
        result.stream().forEach(System.out::println);
    }
}
