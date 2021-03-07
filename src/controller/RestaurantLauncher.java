package controller;

import model.Credits;
import model.CreditsValidation;
import model.Order;

import java.util.Scanner;

/**
 * @author Jacinthe van Niele en Robert Kensen on 5-3-2021
 * @project ChainOfResponsibility
 * Opdracht 1: Kijk of je dish kunt toevoegen in de 'Chain of Responsibility'
 * Opdracht 2: Verander het gedrag van de chain naar random.
 */
public class RestaurantLauncher {
    public static void main(String[] args) {
        // Declaring and initializing variables
        Scanner scanner = new Scanner(System.in);
        int amount;

        // Do - while loop to ask amount of spendable credits, and to compose the menu orders.
        do {
            System.out.print("Specify the amount of credits you want to spend in our sushi restaurant: ");
            amount = scanner.nextInt();
            if (CreditsValidation.isValid(amount)) {
                Order.order(new Credits(amount));
            }
        } while (true);
    }
}


