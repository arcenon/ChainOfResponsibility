package model;

import model.dishes.BlueDish;
import model.dishes.GoldenDish;
import model.dishes.GreenDish;
import model.dishes.RedDish;

/**
 * @author Jacinthe van Niele en Robert Kensen on 7-3-2021
 * @project ChainOfResponsibility
 * This class represents a Base Handler in a 'Chain of Responsibility' design pattern.
 * SushiMenuComposer defines the default handling behaviour. It can be altered though!
 */

public class Order {
    protected static SushiMenuComposer goldenDish = new GoldenDish();
    protected static SushiMenuComposer redDish = new RedDish();
    protected static SushiMenuComposer greenDish = new GreenDish();
    protected static  SushiMenuComposer blueDish = new BlueDish();

    protected static SushiMenuComposer composerChain;
    static {
        goldenDish.setNextSushiComposer((redDish));
        redDish.setNextSushiComposer(greenDish);
        greenDish.setNextSushiComposer(blueDish);
        composerChain = goldenDish;
    }

    public static void order(Credits credits){
        if (credits != null){
            composerChain.compose(credits);
        }
    }
}
