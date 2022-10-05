package com.chenxing.DemoExercise2;

public class Car {
  public static final int STANDARD = 0;
  public static final int LUXURY = 1;
  public static final int NEW_MODEL = 2;

  private final String model;
  private int priceCode;

  public Car(String model, int priceCode) {
    this.model = model;
    this.priceCode = priceCode;
  }

  public String getModel() {
    return model;
  }

  public int getPriceCode() {
    return priceCode;
  }

  public void setPriceCode(int code) {
    priceCode = code;
  }
}
