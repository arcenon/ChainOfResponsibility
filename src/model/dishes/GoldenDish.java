package model.dishes;

import model.SushiMenuComposer;
import model.Credits;


public class GoldenDish extends SushiMenuComposer {
    private static final int SUSHI_VALUE = 50;

    // Constructor matching super
    public GoldenDish() {
        super();
    }

    /**
     * @param credits insert amount of spendable credits
     * This method will dispense a Sushi dish by dividing spendable credits into amount of plates.
     *
     */
    @Override
    public void compose(Credits credits) {
        if (credits != null) {
            int amount = credits.getAmount();
            int remainder = amount;
            if (amount >= SUSHI_VALUE) {
                int count = amount / SUSHI_VALUE;
                remainder = amount % SUSHI_VALUE;
                System.out.printf("Sushi menu contains '%d' golden dishe(s). \n", count);
            }
            if (remainder > 0 && this.nextSushiComposer != null) {
                this.nextSushiComposer.compose(new Credits(remainder));
            }
        }
    }

}
