package com.company;

public class Device {
    boolean isOn;
    static int id = 0;

    public Device(boolean isOn) {
        this.isOn = isOn;
    }

    public Device(int id) {
        this.id = id;
    }

    public Device() {
    }

    public String ping() {
        try {
            if (isOn) {
                return "ON";
            }
        } catch (Exception e) {
        }
        return "OFF";
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public static int getId() {
        id++;
        return id;
    }
}
