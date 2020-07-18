package com.company;

public class Display extends Device {

    public Display(boolean isOn) {
        super(isOn);
    }

    @Override
    public String toString() {
        return "Display";
    }
}
