public class Validation {


    public static boolean validatePassword(String password) {
        return isLongerThan7(password) && containsNumber(password);
    }

    public static boolean isLongerThan7(String password) {
        return password.length() > 7;
    }


    public static boolean containsNumber(String password) {
        char[] chars = password.toCharArray();
        for (char c : chars ) {
            if (Character.isDigit(c)){
                return true;
            }
        }
        return false;
    }

    public static boolean containsUppercase(String password) {
        return !password.equals(password.toLowerCase()); // totalSicher85 == totalsicher85
    }

    public static boolean containsLowercase(String password) {
        return !password.equals(password.toUpperCase()); // totalSicher85 == TOTALSICHER85
    }
}
