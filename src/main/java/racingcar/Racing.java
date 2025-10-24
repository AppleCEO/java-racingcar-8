package racingcar;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Racing {
    private List<Car> cars;
    private int moveCount;

    public Racing(String[] carNames, int moveCount) {
        this.cars = Arrays.stream(carNames)
                .map(name -> new Car(name))
                .collect(Collectors.toList());
        this.moveCount = moveCount;
    }

    public void start() {
        IntStream.range(0, moveCount)
                .forEach(i -> {
                    for (Car car : cars) {
                        car.move();
                    }
                    ConsoleOutput.printRacingStateByMove(cars);
                });
        ConsoleOutput.printResult(getWinners());
    }

    public List<Car> getWinners() {
        int maxPosition = getMaxPosition();
        return getCarsAtMaxPosition(maxPosition);
    }

    private int getMaxPosition() {
        int maxPosition = cars.stream()
                        .mapToInt(Car::getPosition)
                        .max()
                        .orElse(0);
        return maxPosition;
    }

    private List<Car> getCarsAtMaxPosition(int maxPosition) {
        return cars.stream()
                .filter(car -> car.getPosition() == maxPosition)
                .collect(Collectors.toList());
    }
}
