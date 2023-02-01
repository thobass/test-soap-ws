package rocks.basset.soap.bootstrap;

import rocks.basset.soap.domain.User;
import rocks.basset.soap.service.UserService;

import javax.inject.Inject;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Bootstrap implements ServletContextListener {

    @Inject
    UserService userService;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        User user1 = new User();
        User user2 = new User();

        user1.setName("Thomas");
        user1.setName("Max");

        userService.save(user1);
        userService.save(user2);

        System.out.println("Nb User :" + userService.findAll().size());
    }
}
