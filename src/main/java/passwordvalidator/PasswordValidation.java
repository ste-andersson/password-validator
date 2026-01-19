package passwordvalidator;

public class PasswordValidation {
    public static boolean isLongEnough(String password) {
        boolean isLongEnough;
        if(password.length() >= 8) {
            isLongEnough = true;
        } else{
            isLongEnough = false;
        }
        return isLongEnough;
    }
}
