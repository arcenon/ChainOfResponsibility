package model.dishes;

import model.Credits;
import model.SushiMenuComposer;


public class GreenDish extends SushiMenuComposer {
    private static final int SUSHI_VALUE = 10;

    // Constructor matching super
    public GreenDish() {
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
                System.out.printf("Sushi menu contains '%d' green dishe(s). \n", count);
            }
            if ((remainder > 0) && (this.nextSushiComposer != null)) {
                this.nextSushiComposer.compose(new Credits(remainder));
            }
        }
    }
}
