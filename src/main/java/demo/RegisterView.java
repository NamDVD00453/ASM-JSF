package demo;

import javax.faces.bean.ManagedBean;
import java.util.logging.Logger;

@ManagedBean
public class RegisterView {

    private static final Logger LOGGER = Logger.getLogger(RegisterView.class.getName());

    private User user = new User();

    public void doSubmit() {
        LOGGER.info(String.format("Submitted information below: name = '%s', email = '%s', passsword = '%s'", user.getName(), user.getEmail(), user.getPassword()));
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
