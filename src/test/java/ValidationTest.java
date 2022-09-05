import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidationTest {


    @Test
    void shouldReturnFalseWhenPasswordIsShorterThan8(){
        //GIVEN
        String password = "zuKurz";
        //WHEN
        boolean actual = Validation.isLongerThan7(password);
        //THEN
        assertFalse(actual);
    }

    @Test
    void shouldReturnTrueWhenPasswordIsLongerThan7(){
        //GIVEN
        String password = "NichtZuKurz";
        //WHEN
        boolean actual = Validation.isLongerThan7(password);
        //THEN
        assertTrue(actual);
    }

    @Test
    void shouldValidateWhenPasswordIsLongerThan7AndContainsADigit(){
        //GIVEN
        String password = "NichtZuKurz8";
        //WHEN
        boolean actual = Validation.validatePassword(password);
        //THEN
        assertTrue(actual);
    }

    @Test
    void shouldNotValidateWhenPasswordIsShorterThan7ButContainsADigit(){
        //GIVEN
        String password = "zuKurz8";
        //WHEN
        boolean actual = Validation.validatePassword(password);
        //THEN
        assertFalse(actual);
    }
    @Test
    void shouldNotValidateWhenPasswordIsGreaterThan7ButContainsNoDigit(){
        //GIVEN
        String password = "zuKurzsfsfsdf";
        //WHEN
        boolean actual = Validation.validatePassword(password);
        //THEN
        assertFalse(actual);
    }








    @Test
    void shouldReturnTrueWhenPasswordContainsNumber(){
        //GIVEN
        String password = "zuKurz88";
        //WHEN
        boolean actual = Validation.containsNumber(password);
        //THEN
        assertTrue(actual);
    }

    @Test
    void shouldReturnFalseWhenPasswordDidntContainsNumber(){
        //GIVEN
        String password = "zuKurz";
        //WHEN
        boolean actual = Validation.containsNumber(password);
        //THEN
        assertFalse(actual);
    }

    @Test
    void shouldReturnFalseWhenPasswordDidntContainsUppercaseLetter(){
        //GIVEN
        String password = "z";
        //WHEN
        boolean actual = Validation.containsUppercase(password);
        //THEN
        assertFalse(actual);
    }

    @Test
    void shouldReturnTrueWhenPasswordContainsUppercaseLetter(){
        //GIVEN
        String password = "Z";
        //WHEN
        boolean actual = Validation.containsUppercase(password);
        //THEN
        assertTrue(actual);
    }

    @Test
    void shouldReturnTrueWhenPasswordContainsLowercaseLetter(){
        //GIVEN
        String password = "z";
        //WHEN
        boolean actual = Validation.containsLowercase(password);
        //THEN
        assertTrue(actual);
    }

    @Test
    void shouldReturnFalseWhenPasswordContainsNoLowercaseLetter(){
        //GIVEN
        String password = "Z";
        //WHEN
        boolean actual = Validation.containsLowercase(password);
        //THEN
        assertFalse(actual);
    }

}
