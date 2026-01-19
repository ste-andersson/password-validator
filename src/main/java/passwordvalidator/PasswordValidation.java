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

    public static boolean hasUpperCase(String password) {
        for (int i = 0; i < password.length(); i++){
            char a = password.charAt(i);
            if (Character.isUpperCase(a)) {
                return true;
            }
        }
        return false;
    }

}
