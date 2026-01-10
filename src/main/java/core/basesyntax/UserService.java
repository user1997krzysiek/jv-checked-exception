package core.basesyntax;

import javax.crypto.spec.PSource;
import java.io.IOException;
import java.sql.SQLOutput;

public class UserService {
    private PasswordValidator validator = new PasswordValidator() {
        public void registerUser(User user) {
            try {
                validator.validate(user.getPassword(), user.getRepeatPassword());
                saveUser(user);
            } catch (PasswordValidationException e) {
                System.out.println("Wrongs Password");
            }
        }

        public void saveUser(User user) {
            System.out.println("User" + user.toString() + "Was saved  to detabase");
        }
    }
}
