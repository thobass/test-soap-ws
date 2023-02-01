package rocks.basset.soap.endpoint;

import rocks.basset.soap.domain.User;
import rocks.basset.soap.service.UserService;

import javax.inject.Inject;
import javax.inject.Named;
import javax.jws.WebParam;
import java.util.Set;

@Named("webService")
public class UserWebServiceImpl implements UserWebService {
    @Inject
    UserService userService;

    @Override
    public User findById(@WebParam(name="requete") Long id) {
        System.out.println("Calling findById EndPoint");
        return userService.findById(id);
    }

    @Override
    public Set<User> findAll() {
        System.out.println("Calling findAll EndPoint");
        return userService.findAll();
    }
}
