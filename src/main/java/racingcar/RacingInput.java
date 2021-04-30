package racingcar;

import java.util.Scanner;

public class RacingInput {
    Validation validation = new Validation();
    Scanner sc = new Scanner(System.in);

    public void carInput() {
        boolean check = true;
        while (check) {
            System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
            String car = sc.nextLine();
            String[] carArr = car.split(",");
            check = validation.carCntCheck(carArr);
            check = validation.carLenCheck(carArr);
        }
    }

    public void moveNumInput() {
        boolean check = true;
        while (check) {
            System.out.println("시도할 횟수는 몇회인가요?");
            String num = sc.nextLine();
            check = validation.carMoveCheck(num);
        }
    }
}
