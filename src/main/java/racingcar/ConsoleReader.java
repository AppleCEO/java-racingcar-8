package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class ConsoleReader {
    public static String[] carNames;
    public static int moveCount;

    public static void readInput() {
        readCarNames();
        readMoveCount();
    }

    private static void readCarNames() {
        ConsoleOutput.printCarNamesInputGuide();
        String input = Console.readLine();
        carNames = input.split(",");
    }

    private static void readMoveCount() {
        ConsoleOutput.printMoveCountInputGuide();
        moveCount = Integer.parseInt(Console.readLine());
    }
}
