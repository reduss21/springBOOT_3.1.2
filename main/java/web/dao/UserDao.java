package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    void saveUser(User user);

    void removeUser(long id);

    void updateUser(long id, User user);

    List<User> getAllUsers();

    User getUser(long id);
}

