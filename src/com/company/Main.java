package com.company;

import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
        A a = new A();
        a.klaida();
        System.out.println("/////////////////////////////////");

        Input input = new Input();
        int skaicius = 0;
        while (skaicius == 0) {
            try {
                skaicius = input.iveskiteSkaiciu();
                System.out.println("Jūsų skaičius: " + skaicius);
            } catch (InputMismatchException e) {
                System.out.println("Netinkami duomenys!");
            }
        }
    }
}
