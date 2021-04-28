package racingcar;

public class Validation {

    public static boolean carCntCheck(String[] carArr) {
        if(carArr.length <= 1){
            return false;
        }
        return true;
    }
}
