package com.tacos.tacocloud.bl;

import com.tacos.tacocloud.dao.IngredientRepository;
import com.tacos.tacocloud.model.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {
    private IngredientRepository ingredientRepo;

    @Autowired
    public IngredientByIdConverter(IngredientRepository ingredientRepo) {
        this.ingredientRepo = ingredientRepo;
    }

    @Override
    public Ingredient convert(String id) {
        Optional<Ingredient> x = ingredientRepo.findById(id);

        Ingredient ingredient = new Ingredient(x.get().getId(), x.get().getName(), x.get().getType());
        return ingredient;
    }
}
