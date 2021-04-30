package racingcar;

public class Racing {

    RacingInput racingInput = new RacingInput();

    public void gameStart() {
        racingInput.carInput();
        racingInput.moveNumInput();
    }

    public RacingStatus moveAndStop(int random) {
        if (random <= 3) {
            return RacingStatus.STOP;
        }
        return RacingStatus.GO;
    }
}
