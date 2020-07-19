package com.company;

import java.util.List;

public class Monitoring extends Device {

    void pingAllDevices(List<Device> devices) {

        System.out.println("\n-----Pinging started------");
        for (Device device : devices) {
            System.out.println("Device " + device + " with id " + getId() + " is " + device.ping() + " ");
        }
        System.out.println("-----Pinging finished-----\n");
        id = 0;
    }
}
