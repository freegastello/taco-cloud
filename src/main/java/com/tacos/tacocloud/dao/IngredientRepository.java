package com.tacos.tacocloud.dao;

import com.tacos.tacocloud.model.Ingredient;

import java.util.List;

public interface IngredientRepository {
    List<Ingredient> findAll();

    //    Optional<Ingredient> findById(String id);
    Ingredient findById(String id);

    Ingredient save(Ingredient ingredient);
}
