package racingcar;

public class Racing {
    public void gameStart() {

    }

    public RacingStatus moveAndStop(int random) {
        if (random <= 3) {
            return RacingStatus.STOP;
        }
        return RacingStatus.GO;
    }
}
