package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;

public class ConsoleReader {
    public static String[] carNames;
    public static int moveCount;
    private static final int MAX_LENGTH = 5;
    private static final String SPLIT_CHARACTOR = ",";

    public static void readInput() {
        readCarNames();
        readMoveCount();
    }

    private static void readCarNames() {
        ConsoleOutput.printCarNamesInputGuide();
        String input = Console.readLine();
        String[] inputNames = input.split(SPLIT_CHARACTOR);
        validateCarNames(inputNames);
        carNames = inputNames;
    }

    private static void readMoveCount() {
        ConsoleOutput.printMoveCountInputGuide();
        moveCount = Integer.parseInt(Console.readLine());
    }

    private static void validateCarNames(String[] inputNames) {
        Arrays.stream(inputNames)
                .filter(name -> name.length() > 5 || name.contains(" "))
                .forEach(name -> {
                    throw new IllegalArgumentException(Message.ERROR_INVALID_CAR_NAME.get());
                });
    }
}
