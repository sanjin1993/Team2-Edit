package com.edit.viberBot.repository;

import com.edit.viberBot.model.Route;
import com.edit.viberBot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RouteRep extends CrudRepository<Route,Long> {
     List<Route> findAll();
}