package com.examly.springappfood.service;

import com.examly.springappfood.model.Food;
import java.util.List;

public interface FoodService {
    Food addFood(Food food);
    Food updateFood(Long id, Food food);
    Food getFoodById(Long id);
    List<Food> getAllFoods();
}
