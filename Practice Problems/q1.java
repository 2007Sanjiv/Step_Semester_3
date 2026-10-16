import java.util.*;

public class Main {

    static String playRound(String playerMove, String computerMove) {
        if (playerMove.equalsIgnoreCase(computerMove))
            return "Draw";

        if ((playerMove.equalsIgnoreCase("Rock") &&
             computerMove.equalsIgnoreCase("Scissors")) ||
            (playerMove.equalsIgnoreCase("Paper") &&
             computerMove.equalsIgnoreCase("Rock")) ||
            (playerMove.equalsIgnoreCase("Scissors") &&
             computerMove.equalsIgnoreCase("Paper")))
            return "Player Wins";

        return "Computer Wins";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] moves = {"Rock", "Paper", "Scissors"};
        int wins = 0, losses = 0, draws = 0;
        int n = 5;

        System.out.println("Round | Player | Computer | Result");

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter Rock, Paper, or Scissors: ");
            String player = sc.next();

            String computer = moves[rand.nextInt(3)];
            String result = playRound(player, computer);

            if (result.equals("Player Wins"))
                wins++;
            else if (result.equals("Computer Wins"))
                losses++;
            else
                draws++;

            System.out.println(i + " | " + player + " | "
                    + computer + " | " + result);
        }

        double percentage = (wins * 100.0) / n;

        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Draws: " + draws);
        System.out.printf("Win Percentage: %.1f%%%n", percentage);

        sc.close();
    }
}
