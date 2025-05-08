package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, Welcome to our theater\n" +
                "Lets start making your theater reservations");

        System.out.println("Please enter your name \n First Name: ");
        String firstname = scanner.nextLine().trim();

        System.out.println("Please enter your name \n Last Name: ");
        String lastname = scanner.nextLine().trim();

        System.out.println("What date will you be coming (MM/dd/yyyy): ");
        String date = scanner.nextLine().trim();

        System.out.println("How many tickets would you like?");
        String numberOfTickets = scanner.nextLine().trim();

        System.out.println(numberOfTickets + " ticket(s) reserved for " + date + " under " + lastname + ", " + firstname);

    }
}