package racingcar;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    public static boolean carCntCheck(String[] carArr) {
        if (carArr.length <= 1) {
            System.out.println("2대이상 입력해주시기 바랍니다.");
            return true;
        }
        return false;
    }
    public static boolean carLenCheck(String[] carArr) {
        for (int i = 0; i < carArr.length; i++) {
            if (carArr[i].length() > 5) {
                System.out.println("자동차이름은 5자 이하로 입력해주시기 바랍니다.");
                return true;
            }
        }
        return false;
    }

    public static boolean carMoveCheck(String carMove) {
        Pattern p = Pattern.compile("^[0-9]+$");
        Matcher m = p.matcher(carMove);
        if (!m.find()) {
            System.out.println("숫자만 입력해 주시기 바랍니다.");
            return true;
        }
        return false;
    }
}
