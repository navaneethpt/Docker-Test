package com.stellans.dockertest.controllers.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.stellans.dockertest.controllers.entities.User;
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
