package org.product.service;

import org.product.domain.entity.User;
import org.product.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User create(String username) {
        User user = new User();
        user.setUsername(username);
        return userRepository.save(user);
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    public User read(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("User not found by id = " + id));
    }

    public List<User> readAll() {
        return userRepository.findAll();
    }
}
