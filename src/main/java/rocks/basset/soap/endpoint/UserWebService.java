package rocks.basset.soap.endpoint;

import rocks.basset.soap.domain.User;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.Set;

@WebService
public interface UserWebService {
    @WebMethod(operationName = "findById")
    User findById(@WebParam(name="requete") Long id);
    @WebMethod(operationName = "findAll")
    Set<User> findAll();
}
