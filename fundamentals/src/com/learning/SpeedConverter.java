package com.learning;

public class SpeedConverter {
    public static long toMilesPerHour (double kilometersPerHour) {
        long conversion = Math.round(kilometersPerHour / 1.609);
        if (conversion < 0) {
            return -1;
        } else {
            return conversion;
        }
    }

    public static void printConversion (double kilometersPerHour) {
        long conversion = toMilesPerHour(kilometersPerHour);
        if (conversion < 0) {
            System.out.println("Invalid Value");
            return;
        }

        System.out.println(String.format(" %s km/h = %s mi/h", kilometersPerHour, conversion));
        return;

    }
}