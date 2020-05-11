delete from Taco_Order_Tacos;
delete from Taco_Ingredients;
delete from Taco;
delete from Taco_Order;
delete from Ingredient;

insert into Ingredient (ingredientId, ingredientname, ingredienttype) values ('FLTO', 'Flour Tortilla', 'WRAP');
insert into Ingredient (ingredientId, ingredientname, ingredienttype) values ('COTO', 'Corn Tortilla', 'WRAP');
insert into Ingredient (ingredientId, ingredientname, ingredienttype) values ('GRBF', 'Ground Beef', 'PROTEIN');
insert into Ingredient (ingredientId, ingredientname, ingredienttype) values ('CARN', 'Carnitas', 'PROTEIN');
insert into Ingredient (ingredientId, ingredientname, ingredienttype) values ('TMTO', 'Diced Tomatoes', 'VEGGIES');
insert into Ingredient (ingredientId, ingredientname, ingredienttype) values ('LETC', 'Lettuce', 'VEGGIES');
insert into Ingredient (ingredientId, ingredientname, ingredienttype) values ('CHED', 'Cheddar', 'CHEESE');
insert into Ingredient (ingredientId, ingredientname, ingredienttype) values ('JACK', 'Monterrey Jack', 'CHEESE');
insert into Ingredient (ingredientId, ingredientname, ingredienttype) values ('SLSA', 'Salsa', 'SAUCE');
insert into Ingredient (ingredientId, ingredientname, ingredienttype) values ('SRCR', 'Sour Cream', 'SAUCE');