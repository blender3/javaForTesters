package com.dominikk;

public class Part2 {

    public static void Exc5(int a, int b, int c) {

        int numbers[] = new int[]{a, b, c};

        int smallest = numbers[0];
        int largest = numbers[0];

        for ( int i = 1; i < numbers.length; i++) {

            if ( numbers[i] > largest) {
                largest = numbers[i];
            } else if ( numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println(largest + " is the largest number " +
                smallest + " is the smallest number");

    }

    public static void Exc6(double bmi) {

        if(bmi > 18.5 && bmi < 24.9 ) {
            System.out.println("Waga prawidłowa");
        }
        else if(bmi > 24.9) {
            System.out.println("Nadwaga");
        }
        else if(bmi < 18.5) {
            System.out.println("Niedowaga");
        }

    }

    public static double calculateBmi(float weight, float height) {

        float bmi = (weight) / (height * height);
        System.out.println("BMI = " + bmi);
        return bmi;


    }

}
