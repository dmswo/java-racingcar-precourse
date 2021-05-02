package racingcar;

import java.util.Scanner;

public class RacingInput {
    Validation validation = new Validation();
    Scanner sc = new Scanner(System.in);
    
    public String[] carInput() {
        boolean check = true;
        String[] carInput = {};
        while (check) {
            System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
            String car = sc.nextLine();
            carInput = car.split(",");
            check = carInputCheck(carInput);
        }
        return carInput;
    }

    public String moveNumInput() {
        boolean check = true;
        String numInput = "";
        while (check) {
            System.out.println("시도할 횟수는 몇회인가요?");
            numInput = sc.nextLine();
            check = moveNumInputCheck(numInput);
        }
        return numInput;
    }

    private boolean carInputCheck(String[] carInput){
        boolean check = true;
        check = validation.carCntCheck(carInput);
        check = validation.carLenCheck(carInput);
        return check;
    }

    private boolean moveNumInputCheck(String carInput){
        boolean check = true;
        check = validation.carMoveCheck(carInput);
        return check;
    }
}
