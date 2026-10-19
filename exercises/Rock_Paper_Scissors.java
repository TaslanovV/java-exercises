import java.util.Random;

void main() {
    Random rand = new Random();
    int playerScore = 0;
    int computerScore = 0;
    int draws = 0;

    while (true) {
        String option = IO.readln("Rock, paper, scissors or quit: ");
        option = option.trim().toLowerCase();

        if (option.equals("quit")) {
            break;
        }

        if (!option.equals("rock") && !option.equals("paper") && !option.equals("scissors")) {
            IO.println("Invalid choice, try again.");
            continue;
        }

        int pick = rand.nextInt(3);
        String opponent;
        if (pick == 0) {
            opponent = "rock";
        } else if (pick == 1) {
            opponent = "paper";
        } else {
            opponent = "scissors";
        }

        IO.println("Computer chose " + opponent);

        if (option.equals(opponent)) {
            IO.println("Draw");
            draws = draws + 1;
        } else if ((option.equals("rock") && opponent.equals("scissors"))
                || (option.equals("scissors") && opponent.equals("paper"))
                || (option.equals("paper") && opponent.equals("rock"))) {
            IO.println("You win");
            playerScore = playerScore + 1;
        } else {
            IO.println("Computer wins");
            computerScore = computerScore + 1;
        }
    }

    IO.println("Final score - You: " + playerScore + ", Computer: " + computerScore + ", Draws: " + draws);
}
