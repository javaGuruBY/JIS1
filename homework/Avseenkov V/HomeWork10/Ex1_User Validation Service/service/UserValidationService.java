package service;

import bean.User;
import stat.Message;
import static stat.Limits.*;

public class UserValidationService {

    public void validate(User user) {
        try {
            if (!checkAge(user)) {
                throw new Exception(new UserValidationException(Message.AGE_REASON));
            } else if (!checkNameLengthMin(user)) {
                throw new Exception((new UserValidationException(Message.LENGTH_REASON_LESS)));
            } else if (!checkNameLengthMax(user)) {
                throw new Exception(new UserValidationException(Message.LENGTH_REASON_MORE));
            } else {
                System.out.println(user.getFirstName() + " " + user.getLastName() + " has passed user validation.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean checkAge(User user) {
        return (user.getAge() > MIN_AGE && user.getAge() < MAX_AGE);
    }

    private static boolean checkNameLengthMin(User user) {
        return (user.getFirstName().length() > MIN_LENGTH_OF_NAME
                && user.getLastName().length() > MIN_LENGTH_OF_NAME);
    }

    private static boolean checkNameLengthMax(User user) {
        return (user.getFirstName().length() < MAX_LENGTH_OF_NAME
                && user.getLastName().length() < MAX_LENGTH_OF_NAME);
    }
}
