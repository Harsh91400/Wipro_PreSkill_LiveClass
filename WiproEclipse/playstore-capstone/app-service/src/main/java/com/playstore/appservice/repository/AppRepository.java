package com.playstore.appservice.repository;

import com.playstore.appservice.entity.App;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppRepository extends JpaRepository<App, Long> {

    List<App> findByNameContainingIgnoreCase(String name);
    List<App> findByGenreIgnoreCase(String genre);
    List<App> findByAverageRatingGreaterThanEqual(Double rating);
}
