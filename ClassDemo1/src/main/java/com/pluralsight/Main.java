package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fullname;
        int age;
        String profession;

        //--- First person
        //get the data

        System.out.println("What is the person's full name:");
        fullname = scanner.nextLine();

        System.out.println("What is the person's age:");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is the person's profession:");
        profession = scanner.nextLine();

        //create the person
        Person thePerson = new Person(fullname,age, profession);

        //--- Second person
        // get the data
        System.out.println("What is the person's full name:");
        fullname = scanner.nextLine();

        System.out.println("What is the person's age:");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is the person's profession:");
        profession = scanner.nextLine();

        //create the Other person
        Person theOtherPerson = new Person(fullname,age, profession);


        //------ display info from each of the two people.

        System.out.println(thePerson.getFullname());
        System.out.println(theOtherPerson.getFullname());

        displayPerson(thePerson);
        displayPerson(theOtherPerson);

    }
    public static void displayPerson(Person person){
        System.out.printf("Person %s is a %s and is %d years old.\n"
                , person.getFullname()
                , person.getProfession()
                , person.getAge());
    }
    public static void savePerson(String fullname, int age, String profession){
        //do the work of saving the person in a database
    }
}