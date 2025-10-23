package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class ConsoleReader {
    public static String carNames;
    public static String moveCount;

    public static void readInput() {
        readCarNames();
        readMoveCount();
    }

    private static void readCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        carNames = Console.readLine();
    }

    private static void readMoveCount() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        moveCount = Console.readLine();
    }
}
