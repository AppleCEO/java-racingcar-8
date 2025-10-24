package racingcar;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
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
        ConsoleOutput.printResult(getWinners());
    }

    private void move(int carIndex) {
        int randomNumber = random.nextInt(10);
        if (randomNumber >= 4) {
            carPositions[carIndex] += 1;
        }
    }

    public String[] getWinners() {
        int maxPosition = getMaxPosition();
        List<String> winners = new ArrayList<>();
        for (int i = 0; i < carPositions.length; i++) {
            if (carPositions[i] == maxPosition) {
                winners.add(carNames[i]);
            }
        }
        return winners.toArray(new String[0]);
    }

    private int getMaxPosition() {
        int maxPosition = 0;
        for (int position : carPositions) {
            maxPosition = Math.max(position, maxPosition);
        }
        return maxPosition;
    }
}
