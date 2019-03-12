package com.sinoed.gifviewer.repository;

import com.sinoed.gifviewer.model.Gif;
import org.springframework.data.repository.CrudRepository;

public interface GifRepository extends CrudRepository<Gif,Long> {
}
