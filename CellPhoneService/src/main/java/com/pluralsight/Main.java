package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone phone = new CellPhone();

        //get the data
        System.out.println("Enter your serial number: \n (Ex.000-000-000)");
        phone.setSerialNumber(Integer.parseInt((scanner.nextLine())));

        System.out.println("Enter your phone model: \n (Ex.iPhoneX)");
        phone.setModel(scanner.nextLine());

        System.out.println("Enter your cell phone carrier: \n (Ex.AT&T)");
        phone.setCarrier(scanner.nextLine());

        System.out.println("Enter your phone number: \n (Ex.000-000-0000)");
        phone.setPhoneNumber(Integer.parseInt((scanner.nextLine())));

        System.out.println("Enter your the phone's owner's name: \n (Ex.Bruce Wanye)");
        phone.setOwner(scanner.nextLine());

        System.out.println(phone.getSerialNumber());
        System.out.println(phone.getModel());
        System.out.println(phone.getCarrier());
        System.out.println(phone.getPhoneNumber());
        System.out.println(phone.getOwner());
    }
}