package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws NoNetworkException, InterruptedException {
//        A a = new A();
//        a.klaida();
//        System.out.println("/////////////////////////////////");
//
//        /*
//        Input input = new Input();
//        int skaicius = 0;
//        while (skaicius == 0) {
//            try {
//                skaicius = input.iveskiteSkaiciu();
//                System.out.println("Jūsų skaičius: " + skaicius);
//            } catch (InputMismatchException e) {
//                System.out.println("Netinkami duomenys!");
//            }
//        }*/
//
//        Monitoring monitoring = new Monitoring();
//        List<Device> devices = new ArrayList<>();
//
//        devices.add(new Mouse(true));
//        devices.add(new Display(true));
//        devices.add(new Keyboard(true));
//        devices.add(new Mouse(true));
//        devices.add(new Display(true));
//        devices.add(new Keyboard(true));
//
//        monitoring.pingAllDevices(devices);
//        devices.get(3).setOn(false);
//        monitoring.pingAllDevices(devices);
///////////////////////////////////////////////////////////////////////////////////////////

        EmailSender emailSender=new EmailSender();

        List<Email>emails = new ArrayList<>();
        emails.add(new Email("aaa@aaa.lt", "subject1", "body1"));
        emails.add(new Email("bbb@bbb.lt", "subject2", "body2"));
        emails.add(new Email ("ccc@ccc.lt", "subject3", "body3"));
        emails.add(new Email("ddd@ddd.lt", "subject4", "body4"));
        emails.add(new Email("eee@eee.lt", "subject5", "body5"));

        emailSender.sendEmail(emails);
    }

}
