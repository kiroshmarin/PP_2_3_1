package web_spring_crud_app.service;

import web_spring_crud_app.model.User;

import java.util.List;

public interface UserService {

    List<User> index();

    void add(User user);

    void update(Long id, User user);

    void delete(Long id);

    User show(Long id);
}
