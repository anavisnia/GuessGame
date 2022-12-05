public class GuessGame {
    private Player p1;
    private Player p2;
    private Player p3;

    public void start(int rangeOfTargetNumber){
        p1 = new Player();
        int player1guess = 0;
        boolean isPlayer1Right = false;

        p2 = new Player();
        int player2guess = 0;
        boolean isPlayer2Right = false;

        p3 = new Player();
        int player3guess = 0;
        boolean isPlayer3Right = false;

        int targetNumber = (int) (Math.random() * rangeOfTargetNumber);

        if (rangeOfTargetNumber >= 1001){
            System.out.println("The game may take too long. I should think of a smaller number range than " + (rangeOfTargetNumber - 1) +"...");
            return;
        }

        System.out.println("I will think of a number in range from 0 to " + (rangeOfTargetNumber - 1) +".");

        while(true){
            System.out.println("The target number is: " + targetNumber);

            player1guess = p1.guess(rangeOfTargetNumber);
            System.out.println("Player one thinks that the number is: " + player1guess);

            player2guess = p2.guess(rangeOfTargetNumber);
            System.out.println("Player two thinks that the number is: " + player2guess);

            player3guess = p3.guess(rangeOfTargetNumber);
            System.out.println("Player three thinks that the number is: " + player3guess);

            if (player1guess == targetNumber){
                isPlayer1Right = true;
            }

            if (player2guess == targetNumber){
                isPlayer2Right = true;
            }

            if (player3guess == targetNumber){
                isPlayer3Right = true;
            }

            if (isPlayer1Right || isPlayer2Right || isPlayer3Right){
                System.out.println("We have a winner!");
                System.out.println("Is it a first player? " + (isPlayer1Right == true ? "Yes!" : "No!"));
                System.out.println("Is it a second player? " + (isPlayer2Right == true ? "Yes!" : "No!"));
                System.out.println("Is it a third player? " + (isPlayer3Right == true ? "Yes!" : "No!"));
                System.out.println("Congratulations to the winner!");
                break;
            } else {
                System.out.println("Ah... Players should guess again. Lets Go!");
            }
        }
    }
}
