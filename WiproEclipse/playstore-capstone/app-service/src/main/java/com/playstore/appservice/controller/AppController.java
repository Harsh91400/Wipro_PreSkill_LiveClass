package com.playstore.appservice.controller;

import com.playstore.appservice.entity.App;
import com.playstore.appservice.entity.Review;
import com.playstore.appservice.service.AppService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apps")
public class AppController {

    private final AppService appService;

    public AppController(AppService appService) {
        this.appService = appService;
    }

    @PostMapping
    public ResponseEntity<App> create(@RequestBody App app) {
        return ResponseEntity.ok(appService.createApp(app));
    }

    @PutMapping("/{id}")
    public ResponseEntity<App> update(@PathVariable Long id, @RequestBody App app) {
        return ResponseEntity.ok(appService.updateApp(id, app));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        appService.deleteApp(id);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{id}/visibility")
    public ResponseEntity<App> changeVisibility(@PathVariable Long id,
                                                @RequestParam boolean visible) {
        return ResponseEntity.ok(appService.changeVisibility(id, visible));
    }

    @GetMapping("/search")
    public ResponseEntity<List<App>> searchByName(@RequestParam String name) {
        return ResponseEntity.ok(appService.findByName(name));
    }

    @GetMapping("/genre/{genre}")
    public ResponseEntity<List<App>> byGenre(@PathVariable String genre) {
        return ResponseEntity.ok(appService.findByGenre(genre));
    }

    @GetMapping("/filterByRating")
    public ResponseEntity<List<App>> filterByRating(@RequestParam Double rating) {
        return ResponseEntity.ok(appService.filterByRating(rating));
    }

    @PostMapping("/{appId}/reviews")
    public ResponseEntity<Review> addReview(@PathVariable Long appId, @RequestBody Review review) {
        review.setAppId(appId);
        return ResponseEntity.ok(appService.addReview(review));
    }

    @GetMapping("/{appId}/reviews")
    public ResponseEntity<List<Review>> getReviews(@PathVariable Long appId) {
        return ResponseEntity.ok(appService.getReviews(appId));
    }

    @PostMapping("/{appId}/download")
    public ResponseEntity<Void> download(@PathVariable Long appId) {
        appService.increaseDownloadCount(appId);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/hello")
    public String hello() {
        return "App service is working";
    }
}
