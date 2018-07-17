package com.edit.viberBot.repository;

import com.edit.viberBot.model.Route;
import com.edit.viberBot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRep extends JpaRepository<User,Long> {
    User findByViberId(String viberId);
    List<User> findAll();

    //void add(User captenMorgan);
}