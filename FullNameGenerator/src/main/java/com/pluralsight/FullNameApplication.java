package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Collecting information
        System.out.println("Please enter your name \n First Name:");
        String firstname = scanner.nextLine().trim();

        System.out.println("Middle Name:");
        String middlename = scanner.nextLine().trim();

        System.out.println("Last Name:");
        String lastname = scanner.nextLine().trim();

        System.out.println("Suffix");
        String suffix = scanner.nextLine().trim();

        //compute the unknown
        String fullname = "";
        //adds conditions for missing middle name
        if(middlename.isBlank()){
            fullname= firstname + " " + lastname;
        }
        else{
            fullname = firstname + " " + middlename + " " + lastname;
        }
        //nested condition
        if (!suffix.isBlank()){
            fullname += "," + suffix;
        }

        System.out.println("Full Name: " + fullname);
    }
}