package model;

/**
 * This class represents a check if the amount of credits is within an allowable range
 */
public class CreditsValidation {
    private static final int MAX_ALLOWED_CREDITS = 1500;
    private static final int MIN_ALLOWED_CREDITS = 5;

    public static boolean isValid(int amount) {
        if (amount < MIN_ALLOWED_CREDITS) {
            System.out.println("You should order at least one blue dish! Try again.\n");
            return false;
        } else if (amount > MAX_ALLOWED_CREDITS) {
            System.out.println("You can't be this hungry!\n");
            return false;
        } else if (amount % MIN_ALLOWED_CREDITS != 0) {
            System.out.printf("Credits should be a multiple of 5. Try again.\n");
            return false;
        }
        return true;
    }
}
