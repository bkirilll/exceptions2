package seminars.third.tdd;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    List<User> data = new ArrayList<>();

    public void addUser(User user) {
        data.add(user);
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.getName().equals(username)) {
                return true;
            }
        }
        return false;
    }

    public List<User> logout() {
        List<User> admins = new ArrayList<>();
        for (User user: data) {
            if(user.isAdmin()) {
                admins.add(user);
            }
        }
        return admins;
    }

    @Override
    public String toString() {
        return "UserRepository{" +
                "data=" + data +
                '}';
    }
}