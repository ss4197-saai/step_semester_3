import java.util.Random;
import java.util.Scanner;

class RockPaperScissorsW1 {

    static String playRound(String playerMove, String computerMove) {

        if (playerMove.equalsIgnoreCase(computerMove)) {
            return "Draw";
        }

        if ((playerMove.equalsIgnoreCase("Rock") &&
             computerMove.equalsIgnoreCase("Scissors")) ||
            (playerMove.equalsIgnoreCase("Paper") &&
             computerMove.equalsIgnoreCase("Rock")) ||
            (playerMove.equalsIgnoreCase("Scissors") &&
             computerMove.equalsIgnoreCase("Paper"))) {

            return "Player Wins";
        }

        return "Computer Wins";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] moves = {"Rock", "Paper", "Scissors"};

        int rounds = 5;
        int wins = 0;
        int losses = 0;
        int draws = 0;

        String[][] summary = new String[rounds][4];

        for (int i = 0; i < rounds; i++) {

            System.out.print("Enter your move (Rock/Paper/Scissors): ");
            String playerMove = sc.next();

            String computerMove = moves[random.nextInt(3)];

            String result = playRound(playerMove, computerMove);

            System.out.println("Computer Move: " + computerMove);
            System.out.println("Result: " + result);

            summary[i][0] = String.valueOf(i + 1);
            summary[i][1] = playerMove;
            summary[i][2] = computerMove;
            summary[i][3] = result;

            if (result.equals("Player Wins")) {
                wins++;
            } else if (result.equals("Computer Wins")) {
                losses++;
            } else {
                draws++;
            }
        }

        System.out.println("\n----- Final Summary -----");
        System.out.println("Round\tPlayer\tComputer\tResult");

        for (int i = 0; i < rounds; i++) {
            System.out.println(summary[i][0] + "\t" +
                               summary[i][1] + "\t" +
                               summary[i][2] + "\t\t" +
                               summary[i][3]);
        }

        double winPercentage = (wins * 100.0) / rounds;

        System.out.println("\nWins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Draws: " + draws);
        System.out.println("Win Percentage: " + winPercentage + "%");

        sc.close();
    }
}
