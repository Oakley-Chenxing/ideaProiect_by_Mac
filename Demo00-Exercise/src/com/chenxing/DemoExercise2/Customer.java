package com.chenxing.DemoExercise2;

import java.util.ArrayList;
import java.util.List;


public class Customer {
  private final String name;
  private final List<Rental> rentals;

  public Customer(String name) {
    this.name = name;
    rentals = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public void addRental(Rental rental) {
    rentals.add(rental);
  }

  public String statement() {
    int totalAmount = 0;
    int frequentRenterPoints = 0;

    StringBuilder result = new StringBuilder();
    result.append("Rental record for ");
    result.append(getName());
    result.append(":\n");

    // Determine amounts for each rental
    for (Rental rental : rentals) {
      int thisAmount = 0;
      switch (rental.getCar().getPriceCode()) {
        case Car.STANDARD:
          thisAmount += 30 * rental.getDaysRented();
          break;
        case Car.LUXURY:
          thisAmount += 50 * rental.getDaysRented();
          break;
        case Car.NEW_MODEL:
          thisAmount += 40 * rental.getDaysRented();
          break;
      }

      // Each rental earns a frequent renter point...
      ++frequentRenterPoints;

      // ...plus a bonus for at least 3 days rental of a new model
      if (rental.getCar().getPriceCode() == Car.NEW_MODEL && rental.getDaysRented() >= 3) {
        ++frequentRenterPoints;
      }

      // Show figures for this rental
      result.append("- ");
      result.append(rental.getCar().getModel());
      result.append(": ");
      result.append(rental.getDaysRented());
      result.append(" days, £");
      result.append(thisAmount);
      result.append("\n");

      totalAmount += thisAmount;
    }

    // Add footer lines
    result.append("Amount owed is £");
    result.append(totalAmount);
    result.append("\nYou earned ");
    result.append(frequentRenterPoints);
    result.append(" frequent renter points\n");

    return result.toString();
  }
}
