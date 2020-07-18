package com.company;

public class A extends B {
    public int klaida() {
        B b = new B();
        try {
            return b.klaida();
        } catch (ArithmeticException e) {
            System.out.println("Aritmetinė - Klaida");
            return 0;
        }
    }
}
