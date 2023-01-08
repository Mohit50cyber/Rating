package com.rating.RatingService.service;

import com.rating.RatingService.entity.Rating;
import com.rating.RatingService.repository.RatingRepo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface RatingService {

    Rating create(Rating rating);

    List<Rating> getAllratings();

    List<Rating> getRatingByUserId(String userId);

    List<Rating> getRatingByHotelId(String hotelId);



}
