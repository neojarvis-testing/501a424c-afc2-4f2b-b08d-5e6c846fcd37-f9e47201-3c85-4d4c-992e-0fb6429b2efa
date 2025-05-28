package com.examly.springappfood.repository;

import com.examly.springappfood.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepo extends JpaRepository<Food, Long> {
    
}
