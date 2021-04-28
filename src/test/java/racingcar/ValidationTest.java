package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidationTest {

    @Test
    @DisplayName("자동차_2대이상_입력검증")
    void 자동차_2대이상_입력검증(){
        String car1 = "Tesla,제네시스,벤츠";
        String[] carArr1 = car1.split(",");
        String car2 = "Tesla";
        String[] carArr2 = car2.split(",");

        Assertions.assertThat(Validation.carCntCheck(carArr1)).isTrue();
        Assertions.assertThat(Validation.carCntCheck(carArr2)).isFalse();
    }
}
