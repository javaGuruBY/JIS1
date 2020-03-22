package Vladimir_Avseenkov.HomeWork0.ex5_UserLoginService;

public class User {
    String userName;
    String password;
    boolean blocked;
    int tryToLoginCount;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.blocked = false;
        this.tryToLoginCount = 3;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public void resetLoginCount() {
        this.tryToLoginCount = 3;
    }

    public int getTryToLoginCount() {
        return tryToLoginCount;
    }

    public boolean userLogin(String userName, String enteredPassword) {
        if (getTryToLoginCount() <= 0 || isBlocked()) {
            System.out.println("User " + userName + " blocked!");
            return false;
        } else if (getPassword().equals(enteredPassword) & !isBlocked() & getTryToLoginCount() > 0) {
            resetLoginCount();
            System.out.println(getUserName() + " has autorised!");
            return true;
        } else {
            this.tryToLoginCount--;
            System.out.println("Left attempts: " + this.tryToLoginCount + " for user " + userName);
            if (this.tryToLoginCount == 0) {
                setBlocked(true);
            return false;
        }

        }
    }
}
