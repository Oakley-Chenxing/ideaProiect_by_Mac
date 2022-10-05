package com.chenxing.DemoExercise2;

public class Rental {
  private final Car car;
  private final int daysRented;

  public Rental(Car car, int daysRented) {
    this.car = car;
    this.daysRented = daysRented;
  }

  public Car getCar() {
    return car;
  }

  public int getDaysRented() {
    return daysRented;
  }
}
