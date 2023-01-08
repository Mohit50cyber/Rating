package com.rating.RatingService.controller;

import com.rating.RatingService.entity.Rating;
import com.rating.RatingService.repository.RatingRepo;
import com.rating.RatingService.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {

    @Autowired
    private RatingService ratingService;
    @Autowired
    private RatingRepo ratingRepo;

    @PostMapping
    public ResponseEntity<Rating> create(@RequestBody Rating rating){
        return  ResponseEntity.status(HttpStatus.CREATED).body(ratingService.create(rating));
    }
    @GetMapping
    public  ResponseEntity<List<Rating>> getRatings(){

        return  ResponseEntity.ok(ratingService.getAllratings());
    }

    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable String userId){
        return  ResponseEntity.ok(ratingService.getRatingByUserId(userId));
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable String hotelId){
        return  ResponseEntity.ok(ratingService.getRatingByHotelId(hotelId));
    }

}
