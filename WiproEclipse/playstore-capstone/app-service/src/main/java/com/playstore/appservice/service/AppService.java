package com.playstore.appservice.service;

import com.playstore.appservice.entity.App;
import com.playstore.appservice.entity.Review;
import com.playstore.appservice.repository.AppRepository;
import com.playstore.appservice.repository.ReviewRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppService {

    private final AppRepository appRepository;
    private final ReviewRepository reviewRepository;

    public AppService(AppRepository appRepository, ReviewRepository reviewRepository) {
        this.appRepository = appRepository;
        this.reviewRepository = reviewRepository;
    }

    public App createApp(App app) {
        return appRepository.save(app);
    }

    public App updateApp(Long id, App updated) {
        App app = appRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("App not found"));
        app.setName(updated.getName());
        app.setDescription(updated.getDescription());
        app.setGenre(updated.getGenre());
        app.setVersion(updated.getVersion());
        app.setVisible(updated.getVisible());
        app.setReleaseDate(updated.getReleaseDate());
        return appRepository.save(app);
    }

    public void deleteApp(Long id) {
        appRepository.deleteById(id);
    }

    public App changeVisibility(Long id, boolean visible) {
        App app = appRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("App not found"));
        app.setVisible(visible);
        return appRepository.save(app);
    }

    public List<App> findByName(String name) {
        return appRepository.findByNameContainingIgnoreCase(name);
    }

    public List<App> findByGenre(String genre) {
        return appRepository.findByGenreIgnoreCase(genre);
    }

    public List<App> filterByRating(Double rating) {
        return appRepository.findByAverageRatingGreaterThanEqual(rating);
    }

    public Review addReview(Review review) {
        Review saved = reviewRepository.save(review);
        recalculateRating(review.getAppId());
        return saved;
    }

    public List<Review> getReviews(Long appId) {
        return reviewRepository.findByAppId(appId);
    }

    public void increaseDownloadCount(Long appId) {
        App app = appRepository.findById(appId)
                .orElseThrow(() -> new RuntimeException("App not found"));
        app.setDownloadCount(app.getDownloadCount() + 1);
        appRepository.save(app);
    }

    private void recalculateRating(Long appId) {
        List<Review> reviews = reviewRepository.findByAppId(appId);
        if (reviews.isEmpty()) return;
        double avg = reviews.stream().mapToInt(Review::getRating).average().orElse(0);
        App app = appRepository.findById(appId)
                .orElseThrow(() -> new RuntimeException("App not found"));
        app.setAverageRating(avg);
        appRepository.save(app);
    }
}
