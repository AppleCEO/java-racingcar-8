package racingcar;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class RacingTest extends NsTest {
    @Test
    void 레이스_테스트() {
        assertSimpleTest(() -> {
            Racing racing = new Racing(new String[]{"pobi","woni"}, 1);
            racing.start();
            assertThat(output()).contains("pobi :");
            assertThat(output()).contains("woni :");
        });
    }

    @Override
    public void runMain() {
    }
}
