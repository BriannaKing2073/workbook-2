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
        int teamScores = Integer.parseInt(tokens[1]);

        String[] coins = Teams.split(Pattern.quote(":"));

        String homeTeam = coins[0];
        String visitorsTeam = coins[1];

        String[] chips = teamScores.split();

        String homeScore = chips[0];
        String visitorsScore = chips[1];

    }
}