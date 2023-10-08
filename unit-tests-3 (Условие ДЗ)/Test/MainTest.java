import org.junit.jupiter.api.Test;
import seminars.third.tdd.User;
import seminars.third.tdd.UserRepository;
import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
    UserRepository repository1  = new UserRepository();
    UserRepository repository2  = new UserRepository();



    @Test
    public void logoutTest() {
        User user1 = new User("Ivan", "1234", false);
        User user2 = new User("Petr", "12345", true);
        User user3 = new User("Oleg", "124", false);
        repository1.addUser(user1);
        repository1.addUser(user2);
        repository1.addUser(user3);
        List<User> admins = new ArrayList<>();
        admins.add(user2);
        assertThat(repository1.logout()).isEqualTo(admins);
    }
}
