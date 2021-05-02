package racingcar;

public class Car {
    private String name;
    private int count;

    public Car() {}

    public Car(String name) {
        this.name = name;
        this.count = 0;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public void addCount(int randomNum){
        if(moveAndStop(randomNum) == RacingStatus.GO){
            count++;
        }
    }

    public RacingStatus moveAndStop(int random) {
        if (random <= 3) {
            return RacingStatus.STOP;
        }
        return RacingStatus.GO;
    }
}
