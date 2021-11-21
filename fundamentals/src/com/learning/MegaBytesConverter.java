package com.learning;

public class MegaBytesConverter {
  public static void main(String[] args) {
    printMegaBytesAndKiloBytes(1024);
  }
  public static void printMegaBytesAndKiloBytes (int kiloBytes) {
    if (kiloBytes < 0) {
      System.out.println("Invalid Value");
      return;
    }

    int converted = (int) Math.floor(kiloBytes / 1024);

    System.out.println(String.format("%s KB = %s MB and %s KB", kiloBytes, converted, kiloBytes % 1024 ));
    return;
  }
}

