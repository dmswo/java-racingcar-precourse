package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<Car> cars;

    public Cars(String[] cars) {
        this.cars = setCarsList(cars);
    }

    public List<Car> getCars() {
        return cars;
    }

    private List<Car> setCarsList(String[] car) {
        List<Car> setCar = new ArrayList<>();
        for (String cars : car) {
            setCar.add(new Car(cars.trim()));
        }
        return setCar;
    }
}
