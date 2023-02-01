package rocks.basset.soap.service;

import rocks.basset.soap.domain.User;

import java.util.Set;

public interface UserService {
    User findById(Long id);
    Set<User> findAll();
    User save(User object);
    void deleteById(Long id);
    void delete(User object);
    }
