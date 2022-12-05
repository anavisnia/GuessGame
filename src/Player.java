import java.util.ArrayList;

public class Player {
    private int number = 0;
    protected ArrayList<Integer> previousGuesses = new ArrayList<>();

    public int guess(int rangeOfTargetNumber){
        if (previousGuesses.size() == 0){
            this.number = (int) (Math.random() * rangeOfTargetNumber);

            previousGuesses.add(this.number);
        } else {
            int newGuess = (int) (Math.random() * rangeOfTargetNumber);

            while (previousGuesses.contains(newGuess)) {
                newGuess = (int) (Math.random() * rangeOfTargetNumber);
            }

            this.number  = newGuess;

            previousGuesses.add(newGuess);
        }

        return this.number;
    }
}
