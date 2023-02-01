package rocks.basset.soap.service;

import rocks.basset.soap.domain.User;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.util.*;

@ApplicationScoped
public class UserServiceImpl implements UserService {
    protected Map<Long, User> map = new HashMap<>();

    public Set<User> findAll() {
        return new HashSet<>(map.values());
    }

    public User findById(Long id) {
        return map.get(id);
    }

    public User save(User object){

        if(object != null){
            if(object.getId() == null){
                object.setId(getNextId());
            }

            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("Object cannot be null");
        }

        return object;
    }

    public void deleteById(Long id){
        map.remove(id);
    }

    public void delete(User object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    private Long getNextId(){
        Long nextId = null;
        try {
            nextId = Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException e) {
            nextId = 1L;
        }

        return nextId;
    }
}
