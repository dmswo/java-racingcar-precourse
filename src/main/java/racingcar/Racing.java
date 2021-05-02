package racingcar;

public class Racing {
    private Cars cars;
    private int tryNum = 0;

    public void gameStart() {
        gameInputData();
    }

    private void gameInputData(){
        RacingInput racingInput = new RacingInput();
        String[] car = racingInput.carInput();
        cars = new Cars(car);
        tryNum = Integer.parseInt(racingInput.moveNumInput());
    }
}
