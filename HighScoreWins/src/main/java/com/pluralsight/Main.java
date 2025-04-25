package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the final score?");
        String finalScore = scanner.nextLine().trim();

        // "Home:Visitors|21:9";
        String[] tokens = finalScore.split(Pattern.quote("|"));

        // first half:  "Home:Visitors"  (at tokens[0])
        String Teams = tokens[0];

        // second half: "21:9" (at tokens[1])
        String teamScores = tokens[1];

        // "Home:Visitors"
        String[] coins = Teams.split(Pattern.quote(":"));

        String homeTeam = coins[0];
        String visitorsTeam = coins[1];

        // "21:9"
        String[] chips = teamScores.split(Pattern.quote(":"));

        int homeScore = Integer.parseInt(chips[0]);
        int visitorsScore = Integer.parseInt(chips[1]);

        if (homeScore > visitorsScore){
            System.out.println("Winner is "+ homeTeam + " Team with a score of "+ homeScore + "! \n" +
                    "Sorry "+ visitorsTeam + " better luck next time.");
        }else if (homeScore == visitorsScore){
            System.out.println("There is a tie. Both "+ homeTeam + " Team and "+ visitorsTeam + " Team will have to settle this with a rematch.");
        }else if (homeScore < visitorsScore){
                System.out.println("Winner is "+ visitorsTeam + " Team with a score of "+ visitorsTeam + "! \n" +
                        "Sorry "+ homeTeam + " better luck next time.");
        }

    }
}