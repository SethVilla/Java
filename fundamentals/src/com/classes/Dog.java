package com.classes;

public class Dog extends Animal {
   private int eyes;
   private int legs;
   private String coat;

  public Dog(int brain, int body, int size, int weight, int eyes, int legs, String coat) {
    super(brain, body, size, weight);
    this.eyes = eyes;
    this.legs = legs;
    this.coat = coat;
  }

  public int getEyes() {
    return eyes;
  }

  public void setEyes(int eyes) {
    this.eyes = eyes;
  }

  public int getLegs() {
    return legs;
  }

  public void setLegs(int legs) {
    this.legs = legs;
  }

  public String getCoat() {
    return coat;
  }

  public void setCoat(String coat) {
    this.coat = coat;
  }
}
