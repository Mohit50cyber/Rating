package com.rating.RatingService.service.Impl;

import com.rating.RatingService.entity.Rating;
import com.rating.RatingService.repository.RatingRepo;
import com.rating.RatingService.service.RatingService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepo ratingRepo;

    @Override
    public Rating create(Rating rating) {

        return ratingRepo.save(rating);
    }

    @Override
    public List<Rating> getAllratings() {

        return ratingRepo.findAll();
    }

    @Override
    public List<Rating> getRatingByUserId(String userId) {

        return ratingRepo.findByUserId(userId);
    }

    @Override
    public List<Rating> getRatingByHotelId(String hotelId) {

        return ratingRepo.findByHotelId(hotelId);
    }





}
