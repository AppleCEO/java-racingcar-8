package racingcar;

import java.util.Scanner;

public class ConsoleReader {
    public static String readCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
