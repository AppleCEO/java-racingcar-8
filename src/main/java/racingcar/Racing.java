package racingcar;

import java.util.Random;

public class Racing {
    private String[] carNames;
    private int moveCount;
    private int[] carPositions;
    private Random random = new Random();

    public Racing(String[] carNames, int moveCount) {
        this.carNames = carNames;
        this.moveCount = moveCount;
        this.carPositions = new int[carNames.length];
    }

    public void start() {
        for (int moveIndex = 0; moveIndex < moveCount; moveIndex++) {
            for (int carIndex = 0; carIndex < this.carPositions.length; carIndex++) {
                move(carIndex);
            }
            ConsoleOutput.printRacingStateByMove(carNames, carPositions);
        }
    }

    private void move(int carIndex) {
        int randomNumber = random.nextInt(10);
        if (randomNumber >= 4) {
            carPositions[carIndex] += 1;
        }
    }
}
