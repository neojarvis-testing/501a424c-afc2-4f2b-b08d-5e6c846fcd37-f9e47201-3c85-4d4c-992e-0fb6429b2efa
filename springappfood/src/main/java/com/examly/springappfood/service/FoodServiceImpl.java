package com.examly.springappfood.service;

import com.examly.springappfood.model.Food;
import com.examly.springappfood.repository.FoodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    private FoodRepo foodRepo;

    @Override
    public Food addFood(Food food) {
        return foodRepo.save(food);
    }

    @Override
    public Food updateFood(Long id, Food food) {
        Food existing = foodRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Food not found with id: " + id));
        existing.setFoodName(food.getFoodName());
        existing.setPrice(food.getPrice());
        existing.setStockQuantity(food.getStockQuantity());
        existing.setPhoto(food.getPhoto());
        return foodRepo.save(existing);
    }

    @Override
    public Food getFoodById(Long id) {
        return foodRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Food not found with id: " + id));
    }

    @Override
    public List<Food> getAllFoods() {
        return foodRepo.findAll();
    }
}
