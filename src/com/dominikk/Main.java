package com.dominikk;

import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;

public class Main {

    public static void main(String[] args) {

        Part1.Exc1();
        System.out.println("\n");

        Part1.Exc2();
        System.out.println("\n");

        double degreef = 10;
        double degreeC = 54;

        Part1.Exc3(degreeC, degreef);
        System.out.println("\n");

        int value = 5552;

        Part1.Exc4(value);
        System.out.println("\n");

        int a = 43;
        int b = 34;
        int c = 46;

        Part2.Exc5(a,b,c);
        System.out.println("\n");

        Part2.Exc6(Part2.calculateBmi(89,1.78f));
        System.out.println("\n");

    }
}
