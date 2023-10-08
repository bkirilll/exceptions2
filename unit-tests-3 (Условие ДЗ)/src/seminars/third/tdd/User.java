package seminars.third.tdd;

public class User {

    private String name;
    private String password;

    private boolean isAuthenticate = false;

    private boolean isAdmin = false;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    //3.6
    public void authenticate(User user, String name, String password) {
        if (user.getName().equals(name) && user.getPassword().equals(password))
            user.setAuthenticate(true);
        user.setAuthenticate(false);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAuthenticate() {
        return isAuthenticate;
    }

    public void setAuthenticate(boolean authenticate) {
        isAuthenticate = authenticate;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", isAuthenticate=" + isAuthenticate +
                ", isAdmin=" + isAdmin +
                '}';
    }
}