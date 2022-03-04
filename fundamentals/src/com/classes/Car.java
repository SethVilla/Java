package com.classes;

public class Car {
 private String model;

  public String getModel() {
    return model;
  }

  public Car() {
    this("Tesla");
  }

  public Car(String model) {
    this.model = model;
  }

  public void setModel(String model) {
    this.model = model;
  }
}
