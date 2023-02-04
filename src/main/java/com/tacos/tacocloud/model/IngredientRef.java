package com.tacos.tacocloud.model;

import jakarta.persistence.Table;
import lombok.Data;

@Data
public class IngredientRef {
    private final String ingredient;
}
