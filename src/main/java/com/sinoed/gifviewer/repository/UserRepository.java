package com.sinoed.gifviewer.repository;

import com.sinoed.gifviewer.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<UserRepository,Long> {
    Optional<User> findByName(String name);
}
