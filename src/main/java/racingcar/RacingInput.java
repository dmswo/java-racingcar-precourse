package racingcar;

import java.util.Scanner;

public class RacingInput {
    Validation validation = new Validation();

    public void carInput() {
        boolean check = true;
        while (check) {
            Scanner sc = new Scanner(System.in);
            System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
            String car = sc.nextLine();
            String[] carArr = car.split(",");
            check = validation.carCntCheck(carArr);
        }
    }
}
