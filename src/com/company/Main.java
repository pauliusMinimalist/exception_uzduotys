package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        A a = new A();
        a.klaida();
        System.out.println("/////////////////////////////////");

        /*
        Input input = new Input();
        int skaicius = 0;
        while (skaicius == 0) {
            try {
                skaicius = input.iveskiteSkaiciu();
                System.out.println("Jūsų skaičius: " + skaicius);
            } catch (InputMismatchException e) {
                System.out.println("Netinkami duomenys!");
            }
        }*/

        Monitoring monitoring = new Monitoring();
        List<Device> devices = new ArrayList<>();

        devices.add(new Mouse(true));
        devices.add(new Display(true));
        devices.add(new Keyboard(true));
        devices.add(new Mouse(true));
        devices.add(new Display(true));
        devices.add(new Keyboard(true));

        monitoring.pingAllDevices(devices);
        devices.get(3).setOn(false);
        monitoring.pingAllDevices(devices);
    }
}
/*
6. Atskiroje klasėje su main metodu sukurkite keletą įrenginių ir juos monitorinkite. Tada vieną iš įrenginių išjunkite ir vėl monitorinkite.
 */
