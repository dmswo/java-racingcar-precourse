package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RacingTest {

    @Test
    @DisplayName("자동차_전진검증")
    void 자동차_전진검증() {
        Racing racing = new Racing();
        RacingStatus status = racing.moveAndStop(5);
        Assertions.assertThat(status).isEqualTo(RacingStatus.GO);
    }

    @Test
    @DisplayName("자동차_멈춤검증")
    void 자동차_멈춤검증() {
        Racing racing = new Racing();
        RacingStatus status = racing.moveAndStop(0);
        Assertions.assertThat(status).isEqualTo(RacingStatus.STOP);
    }
}
