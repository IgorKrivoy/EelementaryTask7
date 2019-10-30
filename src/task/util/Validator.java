package task.util;

public class Validator {

    public boolean requestContinue(String string) {
        String answer = string.toUpperCase();
        if (answer.equals("YES") || answer.equals("Y")){
            return true;
        } else return false;
    }
}
