package com.rating.RatingService.repository;

import com.rating.RatingService.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepo extends JpaRepository<Rating,Integer> {

    //custom finder method

    List<Rating> findByUserId(String userId);

    List<Rating> findByHotelId(String hotelId);

}
