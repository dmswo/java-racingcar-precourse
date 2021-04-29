package racingcar;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    public static boolean carCntCheck(String[] carArr) {
        if (carArr.length <= 1) {
            return false;
        }
        return true;
    }

    public static boolean carLenCheck(String carArr) {
        if (carArr.length() <= 5) {
            return true;
        }
        return false;
    }

    public static boolean carMoveCheck(String carMove) {
        Pattern p = Pattern.compile("^[0-9]+$");
        Matcher m = p.matcher(carMove);
        if (m.find()) {
            return true;
        }
        return false;
    }
}
