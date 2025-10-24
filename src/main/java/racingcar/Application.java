package racingcar;

public class Application {
    public static void main(String[] args) {
        ConsoleReader.readInput();
        Racing racing = new Racing(ConsoleReader.carNames, ConsoleReader.moveCount);
        racing.start();
    }
}
