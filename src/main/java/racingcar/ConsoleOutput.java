package racingcar;

public class ConsoleOutput {
    public static void printCarNamesInputGuide() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public static void printMoveCountInputGuide() {
        System.out.println("시도할 횟수는 몇 회인가요?");
    }

    public static void printRacingStart() {
        System.out.println("\n실행 결과");
    }

    public static void printRacingStateByMove(String[] carNames, int[] carPositions) {
        for (int carIndex = 0; carIndex < carNames.length; carIndex++) {
            System.out.println(carNames[carIndex] + " : " + "-".repeat(carPositions[carIndex]));
        }
        System.out.println("\n");
    }
}
