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
            run("pobi,wony,domi");
            ConsoleReader reader = new ConsoleReader();
            String result = reader.readCarNames();
            assertThat(result).isEqualTo("pobi,wony,domi");
        });
    }

    @Override
    protected void runMain() {
        
    }
}