package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //establish know values
        System.out.println("What is your full name?");
        String name = scanner.nextLine().trim();

        //calculate the unknown
        String firstName = "";
        //Created First Space
        int firstSpaceIndex = name.indexOf(" ");
        //Idenifing the first name
        firstName = name.substring(0, firstSpaceIndex);

        int secondSpaceIndex = name.indexOf(" ", firstSpaceIndex +1);

        String middleName = "";
        String lastName = "";

        if(secondSpaceIndex >= 0){
            //we have a middle and last name
            middleName = name.substring(firstSpaceIndex + 1, secondSpaceIndex);
            lastName = name.substring(secondSpaceIndex + 1);
        }
        else {
                middleName = "(None)";
                lastName = name.substring(firstSpaceIndex + 1);
        }

        //display the results
        System.out.println();
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);

    }
}