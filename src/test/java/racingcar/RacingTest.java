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

    @Test
    void 최종_우승자_테스트() {
        assertSimpleTest(() -> {
            Racing racing = new Racing(new String[]{"pobi","woni"}, 1);
            racing.start();
            String output = output();
            String[] lines = output.split(System.lineSeparator());
            String lastLine = lines[lines.length - 1];
            assertThat(lastLine).satisfiesAnyOf(
                    s -> assertThat(s).contains("최종 우승자 : pobi"),
                    s -> assertThat(s).contains("최종 우승자 : pobi, woni"),
                    s -> assertThat(s).contains("최종 우승자 : woni")
            );
        });
    }

    @Override
    public void runMain() {
    }
}
