package racingcar;

public class Validation {

    public static boolean carCntCheck(String[] carArr) {
        if(carArr.length <= 1){
            return false;
        }
        return true;
    }

    public static boolean carLenCheck(String carArr) {
        if(carArr.length() <= 5){
            return true;
        }
        return false;
    }
}
