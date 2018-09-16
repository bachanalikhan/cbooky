package com.cbooky.invoice.db;

import org.springframework.data.repository.CrudRepository;

import com.cbooky.invoice.model.User;

public interface UserRepository extends CrudRepository<User, String> {

}
