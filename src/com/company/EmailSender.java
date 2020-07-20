package com.company;
import java.util.ArrayList;
import java.util.List;

public class EmailSender extends NetworkConnector {

    protected void sendEmail(List<Email> emails) throws InterruptedException, NoNetworkException {
        List<Email> failedEmails = iterateThroughEmails(emails);
        List<Email> failedEmailsPart2 = new ArrayList<>();
        if (!failedEmails.isEmpty()) {
            System.out.println("\n__________________________________\n" +
                    "Ne visi laiškai pasiekė adresatus!\n" +
                    "Persiunčiame laiškus. Prašome palaukti...\n\n");
            Thread.sleep(3000);
            for (Email email : failedEmails) {
                try {
                    System.out.println(State.Redelivering + " email to " + email.getReceiver());
                    send(email);
                    System.out.println("Email to " + email.getReceiver() + " " + State.Delivered + "\n");
                } catch (NoNetworkException e) {
                    System.out.println(State.Failed + "-AGAIN to send an email to " + email.getReceiver() + "\n");
                    System.out.println("\n__________________________________\n" +
                            "Dar kartą persiunčiame laiškus. Prašome palaukti...\n\n");
                    failedEmailsPart2.add(email);
                }
            }
            sendEmail(failedEmailsPart2);
        } else {
            System.out.println("\n__________________________________\n" +
                    "Visi laiškai pasiekė adresatus!");
        }
    }





    private List<Email> iterateThroughEmails(List<Email> emails) throws NoNetworkException {
        ArrayList<Email> failedEmails = new ArrayList<>();
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

