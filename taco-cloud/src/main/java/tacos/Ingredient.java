package tacos;

import lombok.Data;

@Data
public class Ingredient {

    private final String ingredientId;
    private final String ingredientName;
    private final Type ingredientType;

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
