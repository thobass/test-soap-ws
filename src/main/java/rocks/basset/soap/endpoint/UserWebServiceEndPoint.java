package rocks.basset.soap.endpoint;

import org.apache.cxf.interceptor.OutInterceptors;
import rocks.basset.soap.domain.User;

import javax.inject.Inject;
import javax.inject.Named;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.Set;

@WebService(endpointInterface = "rocks.basset.soap.endpoint.UserWebService", serviceName = "UserWebServiceEndPoint")
@OutInterceptors(interceptors = {"rocks.basset.soap.interceptor.MyInterceptor"})
public class UserWebServiceEndPoint implements UserWebService {
    @Inject
    @Named("webService")
    UserWebService userWebService;

    @Override
    public User findById(@WebParam(name="requete") Long id) {
        return userWebService.findById(id);
    }

    @Override
    public Set<User> findAll() {
        return userWebService.findAll();
    }
}
