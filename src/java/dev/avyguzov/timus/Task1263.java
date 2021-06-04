package dev.avyguzov.timus;

import java.util.Scanner;

public class Task1263 {
    public static String[] solution(int[] votes, int candidatesCount) {
        int[] candidatesVotesCounts = new int[candidatesCount];

        for (int vote : votes) {
            candidatesVotesCounts[vote - 1]++;
        }

        String[] percents = new String[candidatesCount];
        for (int i = 0; i < candidatesCount; i++) {
            percents[i] = String.format("%,.2f", (double) candidatesVotesCounts[i] / votes.length * 100) + "%";
        }

        return percents;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int candidatesCount = s.nextInt();
        int electorsCount = s.nextInt();
        int[] votes = new int[electorsCount];

        for (int i = 0; i < votes.length; i++) {
            votes[i] = s.nextInt();
        }

        for (String votesPercentage: solution(votes, candidatesCount)) {
            System.out.println(votesPercentage);
        }
    }
}
