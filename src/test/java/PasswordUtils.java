import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordUtils {
    @Test
    public void generatePassword() {
        PasswordEncoder encoder = new BCryptPasswordEncoder(11);
        System.out.println(encoder.encode("madmax"));
    }
}
