package tacos.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import tacos.Ingredient;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class JdbcIngredientRepository implements IngredientRepository {

    private JdbcTemplate jdbc;

    @Autowired
    public JdbcIngredientRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public Iterable<Ingredient> findAll() {
        return jdbc.query("select ingredientId, ingredientName, ingredientType from Ingredient", this::mapRowToIngredient);
    }

    @Override
    public Ingredient findOne(String id) {
        return jdbc.queryForObject("select ingredientId, ingredientName, ingredientType from Ingredient where ingredientId = ?",
                this::mapRowToIngredient, id);
    }

    @Override
    public Ingredient save(Ingredient ingredient) {
        jdbc.update("insert into Ingredient (ingredientId, ingredientName, ingredientType) values (?.?.?)",
                ingredient.getIngredientId(), ingredient.getIngredientName(), ingredient.getIngredientType().toString());

        return ingredient;
    }

    private Ingredient mapRowToIngredient(ResultSet resultSet, int i) throws SQLException {
        return new Ingredient(resultSet.getString("ingredientId"), resultSet.getString("ingredientName"),
                Ingredient.Type.valueOf(resultSet.getString("ingredientType")));
    }
}
