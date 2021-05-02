package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Racing {
    private Cars cars;
    private int tryNum = 0;
    private int maxMove = 0;
    private List<String> victoryList = new ArrayList<>();

    public void gameStart() {
        gameInputData();
        gamePlay(cars, tryNum);
    }

    private void gameInputData(){
        RacingInput racingInput = new RacingInput();
        String[] car = racingInput.carInput();
        cars = new Cars(car);
        tryNum = Integer.parseInt(racingInput.moveNumInput());
    }

    private void gamePlay(Cars cars, int tryNum){
        System.out.println("실행 결과");
        for (int i = 0; i < tryNum; i++) {
            play(cars.getCars());
            show(cars.getCars());
        }
    }

    private void play(List<Car> car){
        for (int i = 0; i < car.size(); i++) {
            int randomNum = (int)(Math.random() * 9);
            car.get(i).addCount(randomNum);
        }
    }

    private void show(List<Car> car){
        for (int i = 0; i < car.size(); i++) {
            System.out.print(car.get(i).getName() + " : ");
            System.out.println(print(car.get(i).getCount()));
        }
        System.out.println();
    }

    private String print(int getCount){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < getCount; i++) {
            str.append("-");
        }
        return str.toString();
    }

}
