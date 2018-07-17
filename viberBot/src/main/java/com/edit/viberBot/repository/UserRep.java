package com.edit.viberBot.repository;

import com.edit.viberBot.model.Route;
import com.edit.viberBot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
<<<<<<< HEAD
public interface UserRep extends JpaRepository<User,Long> {
    User findByViberId(String viberId);
    List<User> findAll();

    //void add(User captenMorgan);
=======
public interface UserRep extends CrudRepository<User,Long> {
    public User findByViberId(String viberId);
    public List<User> findAll();
>>>>>>> 4ee1dc3e939caca2167e14756a808ed43e8a1fbc
}