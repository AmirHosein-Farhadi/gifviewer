package com.sinoed.gifviewer.repository;

import com.sinoed.gifviewer.model.Gif;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface GifRepository extends CrudRepository<Gif,Long> {

    Optional<Gif> findByName(String name);
}
