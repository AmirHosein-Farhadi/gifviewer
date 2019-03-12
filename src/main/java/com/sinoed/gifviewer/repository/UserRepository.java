package com.sinoed.gifviewer.repository;

import com.sinoed.gifviewer.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
}
