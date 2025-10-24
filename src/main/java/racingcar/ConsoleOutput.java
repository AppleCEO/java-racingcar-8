package racingcar;

import java.util.List;

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

    public static void printRacingStateByMove(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getName() + " : " + "-".repeat(car.getPosition()));
        }
        System.out.println();
    }

    public static void printResult(List<Car> cars) {
        List<String> carNames = cars.stream()
                                .map(Car::getName)
                                .toList();
        System.out.println(Message.FINAL_WINNER_PREFIX + String.join(", ", carNames));
    }
}
