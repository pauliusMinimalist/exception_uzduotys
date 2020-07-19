package com.company;

import java.util.Random;

class NetworkConnector {

    public void send(Object o) throws NoNetworkException {

        Random rand = new Random();
        int n = rand.nextInt(5);
        try {
            int i = 1 / n;
        } catch (ArithmeticException e) {
            throw new NoNetworkException();
        }
    }
}

