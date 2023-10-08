package seminars.third.tdd;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Ivan", "1234", false);
        User user2 = new User("Petr", "12345", true);
        User user3 = new User("Oleg", "124", false);
        User user4 = new User("Max", "123234", false);
        User user5 = new User("Olga", "12234", true);
        UserRepository repository = new UserRepository();
        user1.authenticate(user1, "Ivan", "1234");
        user1.authenticate(user2, "Petr", "12345");
        user1.authenticate(user5, "Olga", "12234");
        repository.addUser(user1);
        repository.addUser(user2);
        repository.addUser(user3);
        repository.addUser(user4);
        repository.addUser(user5);
        List<User> admins = repository.logout();
        System.out.println(admins.toString());

    }
}
