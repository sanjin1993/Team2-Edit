package com.edit.viberBot.repository;

import com.edit.viberBot.model.Route;
import com.edit.viberBot.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRep extends CrudRepository<User,Long> {

   /* List<User>findAll();
    User findById(int id);
    User save(Route route);
    int delete(int id);
    void edit(int id, Route editedRoute);*/
}
