import bean.User;
import service.UserValidationService;

public class RunMe implements Runnable {
    @Override
    public void run() {
        creatingAndValidateNewUsers();
    }

    void creatingAndValidateNewUsers() {
        User incorrectAgeUser = new User ("Vasya", "Pupkin", 121);
        User incorrectLengthFirstName = new User("Ya", "Krevedko", 15);
        User incorrectLengthLastName = new User("Name", "LastNameWhichHasMoreThan15Symbols", 33);
        User correctUser = new User("Name", "Surname", 42);

        UserValidationService service = new UserValidationService();
        service.validate(incorrectAgeUser);
        service.validate(incorrectLengthFirstName);
        service.validate(incorrectLengthLastName);
        service.validate(correctUser);
    }
}
