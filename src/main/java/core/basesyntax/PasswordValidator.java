package core.basesyntax;

import java.lang.reflect.UndeclaredThrowableException;
import java.sql.SQLOutput;

public class PasswordValidator extends Exception {
    public void validate (String password, String repeatPassword) throws PasswordValidationException {
        if (password != null && password.equals(repeatPassword) && (password.length() >= 10)) {
            return;
        } else {
            throw new PasswordValidationException ("Wrong password");
        }
    }
}