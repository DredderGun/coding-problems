package dev.avyguzov.timus;

import java.util.*;

// https://timus.online/problem.aspx?space=1&num=1100
public class Task1100 {
    private static final HashMap<Integer, List<Integer>> teamsScores = new HashMap<>();
    
    static {
        for (int i = 100; i >= 0; i--) {
            teamsScores.put(i, new ArrayList<>());
        }
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        for (int i = 0; i < n; i++) {
            Integer commandNumber = s.nextInt();
            Integer commandScore = s.nextInt();
            teamsScores.computeIfPresent(commandScore, (e, ar) -> {
              ar.add(commandNumber);
              return ar;
            });
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 100; i >= 0; i--) {
            List<Integer> currTeams = teamsScores.get(i);
            if (currTeams == null || currTeams.isEmpty()) {
                continue;
            }
            int finalI = i;
            currTeams.forEach(teamId -> {
                sb.setLength(0);
                sb.append(teamId);
                sb.append(" ");
                sb.append(finalI);
                System.out.println(sb);
            });
        }
    }
}
