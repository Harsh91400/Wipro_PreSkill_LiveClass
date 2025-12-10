package com.playstore.appservice.repository;

import com.playstore.appservice.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByAppId(Long appId);
}
