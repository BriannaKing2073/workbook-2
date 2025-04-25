package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Dice dice = new Dice();
        int roll1;
        int roll2;
        int numof2 = 0;
        int numof4 = 0;
        int numof6 = 0;
        int numof7 = 0;

        for(int rollNumber = 0; rollNumber <= 100; rollNumber++){
           roll1 = dice.roll();
           roll2 = dice.roll();
           int rollTotal = roll1 + roll2;
           System.out.printf("Roll #%d: %d - %d Sum: %d\n",rollNumber, roll1,roll2,rollTotal);

           if (rollTotal == 2){numof2++;}
           if (rollTotal == 4){numof4++;}
           if (rollTotal == 6){numof6++;}
           if (rollTotal == 7){numof7++;}
        }
        System.out.println("Total number of 2s:" + numof2);
        System.out.println("Total number of 4s:" + numof4);
        System.out.println("Total number of 6s:" + numof6);
        System.out.println("Total number of 7s:" + numof7);
    }
}