package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RacingTest {

    @Test
    @DisplayName("자동차_전진검증")
    void 자동차_전진검증() {
        Car car = new Car();
        RacingStatus status = car.moveAndStop(5);
        Assertions.assertThat(status).isEqualTo(RacingStatus.GO);
    }

    @Test
    @DisplayName("자동차_멈춤검증")
    void 자동차_멈춤검증() {
        Car car = new Car();
        RacingStatus status = car.moveAndStop(0);
        Assertions.assertThat(status).isEqualTo(RacingStatus.STOP);
    }
}
