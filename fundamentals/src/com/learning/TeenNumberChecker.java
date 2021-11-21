package com.learning;

public class TeenNumberChecker {
  public static boolean hasTeen(int num1, int num2, int num3) {
    return 13 <= num1 && num1 <=19 || 13 <= num2 && num2 <=19 || 13 <= num3 && num3 <=19;
  }

  public static boolean isTeen(int num1) {
    return 13 <= num1 && num1 <=19;
  }
}
