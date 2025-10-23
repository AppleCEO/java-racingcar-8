package racingcar;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ConsoleReaderTest extends NsTest {

    @Test
    void 사용자_입력_테스트() {
        assertSimpleTest(() -> {
            run("pobi,wony,domi", "1");
            ConsoleReader.readInput();
            assertThat(ConsoleReader.carNames).isEqualTo("pobi,wony,domi");
            assertThat(ConsoleReader.moveCount).isEqualTo("1");
        });
    }

    @Test
    void 차_이름_사용자_입력_안내_메시지_테스트() {
        assertSimpleTest(() -> {
            run("pobi,woni", "1");
            ConsoleReader.readInput();
            assertThat(output()).contains("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        });
    }

    @Override
    protected void runMain() {
        
    }
}