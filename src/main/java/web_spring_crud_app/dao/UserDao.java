package web_spring_crud_app.dao;

import web_spring_crud_app.model.User;

import java.util.List;

public interface UserDao {

    List<User> findAllUsers();

    void addUser(User user);

    void updateUser(Long id, User user);

    void deleteUser(Long id);

    User showUser(Long id);


}
