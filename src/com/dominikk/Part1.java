package com.dominikk;

public class Part1 {

    public static void Exc1() {

        boolean myBooleanValue = false;
        char myCharValue = '\u00A9';
        int myIntValue = 150;
        long myLongValue = 342423432;
        float myFloatValue = 5.4f;
        double myDoublevalue = 321322342312d;
        String myStringValue = "Some string";

        System.out.println("boolean: " + myBooleanValue +
                "\n" + "char: " + myCharValue +
                "\n" + "int: " + myIntValue +
                "\n" + "long: " + myLongValue +
                "\n" + "float: " + myFloatValue +
                "\n" + "double: " + myDoublevalue +
                "\n" + "String: " + myStringValue);
    }

    public static void Exc2() {

        int a = 10;
        float b = 3.5f;

        float addition = a + b;
        float subtraction = a - b;
        float division = a * b;
        float multiplication = a / b;
        float modulo = a % b;

        System.out.println("A + B: " + addition +
                "\n" + "A - B = " + subtraction +
                "\n" + "A * B = " + division +
                "\n" + "A / B = " + multiplication +
                "\n" + "A % B = " + modulo);
    }

    public static void Exc3(double fahreheit, double celcious) {

        double t1 = toCelcious(fahreheit);
        double t2 = toFahreheit(celcious);

        System.out.println(fahreheit + "°F = " +
                t1 + "°C" );
        System.out.println(celcious + "°C = " +
                t2 + "°F" );
    }

    public static double toFahreheit(double celcious) {

        double fahreheit = 1.8 * celcious + 32.0;
        return fahreheit;
    }

    public static double toCelcious(double fahreheit) {

        double celcious = (fahreheit - 32) * 1.8;
        return celcious;
    }

    public static void Exc4(int value){

        int result = 0;
        int digits = 0;

        while (value != 0) {
            digits +=1;
            result += value % 10;
            value /= 10;
        }

        System.out.println("Sum: " + result +
                " Avg: " +  calculateAvg(result,digits));

    }

    public static float calculateAvg(int results, int digits) {
        float avg = (float) results/digits;
        return avg;
    }

}
