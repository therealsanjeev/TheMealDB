package com.therealsanjeev.themealdb.fragment.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class MealDetailsModel(
    @Json(name = "meals")
    val meals: List<Meal>
) {
    data class Meal(
        @Json(name = "dateModified")
        val dateModified: Any, // null
        @Json(name = "idMeal")
        val idMeal: String, // 53062
        @Json(name = "strArea")
        val strArea: String, // Croatian
        @Json(name = "strCategory")
        val strCategory: String, // Dessert
        @Json(name = "strCreativeCommonsConfirmed")
        val strCreativeCommonsConfirmed: Any, // null
        @Json(name = "strDrinkAlternate")
        val strDrinkAlternate: Any, // null
        @Json(name = "strImageSource")
        val strImageSource: Any, // null
        @Json(name = "strIngredient1")
        val strIngredient1: String, // Flour
        @Json(name = "strIngredient10")
        val strIngredient10: String, // Brown Sugar
        @Json(name = "strIngredient11")
        val strIngredient11: String, // Cinnamon
        @Json(name = "strIngredient12")
        val strIngredient12: String, // Milk
        @Json(name = "strIngredient13")
        val strIngredient13: String, // Icing Sugar
        @Json(name = "strIngredient14")
        val strIngredient14: String,
        @Json(name = "strIngredient15")
        val strIngredient15: String,
        @Json(name = "strIngredient16")
        val strIngredient16: String,
        @Json(name = "strIngredient17")
        val strIngredient17: String,
        @Json(name = "strIngredient18")
        val strIngredient18: String,
        @Json(name = "strIngredient19")
        val strIngredient19: String,
        @Json(name = "strIngredient2")
        val strIngredient2: String, // Caster Sugar
        @Json(name = "strIngredient20")
        val strIngredient20: String,
        @Json(name = "strIngredient3")
        val strIngredient3: String, // Yeast
        @Json(name = "strIngredient4")
        val strIngredient4: String, // Salt
        @Json(name = "strIngredient5")
        val strIngredient5: String, // Milk
        @Json(name = "strIngredient6")
        val strIngredient6: String, // Eggs
        @Json(name = "strIngredient7")
        val strIngredient7: String, // Butter
        @Json(name = "strIngredient8")
        val strIngredient8: String, // Walnuts
        @Json(name = "strIngredient9")
        val strIngredient9: String, // Butter
        @Json(name = "strInstructions")
        val strInstructions: String, // Mix all the ingredients for the dough together and knead well. Cover the dough and put to rise until doubled in size which should take about 2 hours. Knock back the dough and knead lightly. Divide the dough into two equal pieces; roll each piece into an oblong about 12 inches by 8 inches. Mix the filling ingredients together and divide between the dough, spreading over each piece. Roll up the oblongs as tightly as possible to give two 12 inch sausages. Place these side by side, touching each other, on a greased baking sheet. Cover and leave to rise for about 40 minutes. Heat oven to 200ºC (425ºF). Bake for 30-35 minutes until well risen and golden brown. Bread should sound hollow when the base is tapped. Remove from oven and brush the hot bread top with milk. Sift with a generous covering of icing sugar.
        @Json(name = "strMeal")
        val strMeal: String, // Walnut Roll Gužvara
        @Json(name = "strMealThumb")
        val strMealThumb: String, // https://www.themealdb.com/images/media/meals/u9l7k81628771647.jpg
        @Json(name = "strMeasure1")
        val strMeasure1: String, // 450g
        @Json(name = "strMeasure10")
        val strMeasure10: String, // 85g
        @Json(name = "strMeasure11")
        val strMeasure11: String, // 1 tsp 
        @Json(name = "strMeasure12")
        val strMeasure12: String, // To Glaze
        @Json(name = "strMeasure13")
        val strMeasure13: String, // To Glaze
        @Json(name = "strMeasure14")
        val strMeasure14: String,
        @Json(name = "strMeasure15")
        val strMeasure15: String,
        @Json(name = "strMeasure16")
        val strMeasure16: String,
        @Json(name = "strMeasure17")
        val strMeasure17: String,
        @Json(name = "strMeasure18")
        val strMeasure18: String,
        @Json(name = "strMeasure19")
        val strMeasure19: String,
        @Json(name = "strMeasure2")
        val strMeasure2: String, // 55g
        @Json(name = "strMeasure20")
        val strMeasure20: String,
        @Json(name = "strMeasure3")
        val strMeasure3: String, // 2 parts 
        @Json(name = "strMeasure4")
        val strMeasure4: String, // 1/2 tsp
        @Json(name = "strMeasure5")
        val strMeasure5: String, // 6 oz 
        @Json(name = "strMeasure6")
        val strMeasure6: String, // 2 Beaten 
        @Json(name = "strMeasure7")
        val strMeasure7: String, // 30g
        @Json(name = "strMeasure8")
        val strMeasure8: String, // 140g
        @Json(name = "strMeasure9")
        val strMeasure9: String, // 85g
        @Json(name = "strSource")
        val strSource: String, // https://www.visit-croatia.co.uk/croatian-cuisine/croatian-recipes/
        @Json(name = "strTags")
        val strTags: String, // Nutty
        @Json(name = "strYoutube")
        val strYoutube: String // https://www.youtube.com/watch?v=Q_akngSJVrQ
    )
}