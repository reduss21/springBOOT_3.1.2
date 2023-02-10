package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    void saveUser(User user);

    void removeUser(long id);

    List<User> getAllUsers();

    void updateUser(long id, User user);

    User getUser(long id);
}
