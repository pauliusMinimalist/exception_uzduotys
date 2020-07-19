package com.company;
import java.util.ArrayList;
import java.util.List;

public class EmailSender extends NetworkConnector {




    void sendEmail(List<Email> emails) throws InterruptedException, NoNetworkException {
        List<Email> failedEmails = iterateThroughEmails(emails);
        if (!failedEmails.isEmpty()) {
            System.out.println("__________________________________");
            System.out.println("Ne visi laiškai pasiekė adresatus!");
            System.out.println("Persiunčiame laiškus. Prašome palaukti...\n\n");
            Thread.sleep(3000);
            for (Email email : failedEmails) {
                System.out.println(State.Redelivering + " email to " + email.getReceiver());
                System.out.println("Email to " + email.getReceiver() + " " + State.Delivered + "\n");
            }
        } else {
            System.out.println("\n__________________________________");
            System.out.println("Visi laiškai pasiekė adresatus!");
        }
    }





    List<Email> iterateThroughEmails(List<Email> emails) throws NoNetworkException {
        List<Email> failedEmails = new ArrayList<>();
        for (Email email : emails) {
            try {
                System.out.println(State.Sending + " email to " + email.getReceiver());
                send(email);
                System.out.println("Email to " + email.getReceiver() + " " + State.Delivered + "\n");
            } catch (NoNetworkException e) {
                System.out.println(State.Failed + " to send an email to " + email.getReceiver() + "\n");
                failedEmails.add(email);
            }
        }
        return failedEmails;
    }
}

