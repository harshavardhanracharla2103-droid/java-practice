import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> votes = new HashMap<>();
        
        System.out.print("Enter candidates (comma separated): ");
        String[] candidates = sc.nextLine().split(",");
        for (String c : candidates) {
            votes.put(c.trim(), 0);
        }
        
        System.out.print("Enter number of voters: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Voter " + (i + 1) + " vote: ");
            String vote = sc.nextLine().trim();
            if (votes.containsKey(vote)) {
                votes.put(vote, votes.get(vote) + 1);
            }
        }
        
        System.out.println("\n=== RESULTS ===");
        String winner = "";
        int max = 0;
        for (Map.Entry<String, Integer> e : votes.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
            if (e.getValue() > max) {
                max = e.getValue();
                winner = e.getKey();
            }
        }
        System.out.println("Winner: " + winner);
    }
}
    
}
