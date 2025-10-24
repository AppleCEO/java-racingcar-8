package racingcar;

public class ConsoleOutput {
    public static void printCarNamesInputGuide() {
        System.out.println(Message.PROMPT_CAR_NAMES);
    }

    public static void printMoveCountInputGuide() {
        System.out.println(Message.PROMPT_RACE_ROUNDS);
    }

    public static void printRacingStart() {
        System.out.println(Message.RESULT_HEADER);
    }

    public static void printRacingStateByMove(String[] carNames, int[] carPositions) {
        for (int carIndex = 0; carIndex < carNames.length; carIndex++) {
            System.out.println(carNames[carIndex] + " : " + "-".repeat(carPositions[carIndex]));
        }
        System.out.println("\n");
    }

    public static void printResult(String[] carNames) {
        System.out.println(Message.FINAL_WINNER_PREFIX + String.join(", ", carNames));
    }
}
