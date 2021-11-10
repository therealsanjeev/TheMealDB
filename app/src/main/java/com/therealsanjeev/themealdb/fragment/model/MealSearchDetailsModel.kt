package com.therealsanjeev.themealdb.fragment.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MealSearchDetailsModel(
    @Json(name = "meals")
    val meals: List<Meal>
) {
    @JsonClass(generateAdapter = true)
    data class Meal(
        @Json(name = "dateModified")
        val dateModified: Any, // null
        @Json(name = "idMeal")
        val idMeal: String, // 52771
        @Json(name = "strArea")
        val strArea: String, // Italian
        @Json(name = "strCategory")
        val strCategory: String, // Vegetarian
        @Json(name = "strCreativeCommonsConfirmed")
        val strCreativeCommonsConfirmed: Any, // null
        @Json(name = "strDrinkAlternate")
        val strDrinkAlternate: Any, // null
        @Json(name = "strImageSource")
        val strImageSource: Any, // null
        @Json(name = "strIngredient1")
        val strIngredient1: String, // penne rigate
        @Json(name = "strIngredient10")
        val strIngredient10: String,
        @Json(name = "strIngredient11")
        val strIngredient11: String,
        @Json(name = "strIngredient12")
        val strIngredient12: String,
        @Json(name = "strIngredient13")
        val strIngredient13: String,
        @Json(name = "strIngredient14")
        val strIngredient14: String,
        @Json(name = "strIngredient15")
        val strIngredient15: String,
        @Json(name = "strIngredient16")
        val strIngredient16: Any, // null
        @Json(name = "strIngredient17")
        val strIngredient17: Any, // null
        @Json(name = "strIngredient18")
        val strIngredient18: Any, // null
        @Json(name = "strIngredient19")
        val strIngredient19: Any, // null
        @Json(name = "strIngredient2")
        val strIngredient2: String, // olive oil
        @Json(name = "strIngredient20")
        val strIngredient20: Any, // null
        @Json(name = "strIngredient3")
        val strIngredient3: String, // garlic
        @Json(name = "strIngredient4")
        val strIngredient4: String, // chopped tomatoes
        @Json(name = "strIngredient5")
        val strIngredient5: String, // red chile flakes
        @Json(name = "strIngredient6")
        val strIngredient6: String, // italian seasoning
        @Json(name = "strIngredient7")
        val strIngredient7: String, // basil
        @Json(name = "strIngredient8")
        val strIngredient8: String, // Parmigiano-Reggiano
        @Json(name = "strIngredient9")
        val strIngredient9: String,
        @Json(name = "strInstructions")
        val strInstructions: String, // Bring a large pot of water to a boil. Add kosher salt to the boiling water, then add the pasta. Cook according to the package instructions, about 9 minutes. In a large skillet over medium-high heat, add the olive oil and heat until the oil starts to shimmer. Add the garlic and cook, stirring, until fragrant, 1 to 2 minutes. Add the chopped tomatoes, red chile flakes, Italian seasoning and salt and pepper to taste. Bring to a boil and cook for 5 minutes. Remove from the heat and add the chopped basil. Drain the pasta and add it to the sauce. Garnish with Parmigiano-Reggiano flakes and more basil and serve warm.
        @Json(name = "strMeal")
        val strMeal: String, // Spicy Arrabiata Penne
        @Json(name = "strMealThumb")
        val strMealThumb: String, // https://www.themealdb.com/images/media/meals/ustsqw1468250014.jpg
        @Json(name = "strMeasure1")
        val strMeasure1: String, // 1 pound
        @Json(name = "strMeasure10")
        val strMeasure10: String,
        @Json(name = "strMeasure11")
        val strMeasure11: String,
        @Json(name = "strMeasure12")
        val strMeasure12: String,
        @Json(name = "strMeasure13")
        val strMeasure13: String,
        @Json(name = "strMeasure14")
        val strMeasure14: String,
        @Json(name = "strMeasure15")
        val strMeasure15: String,
        @Json(name = "strMeasure16")
        val strMeasure16: Any, // null
        @Json(name = "strMeasure17")
        val strMeasure17: Any, // null
        @Json(name = "strMeasure18")
        val strMeasure18: Any, // null
        @Json(name = "strMeasure19")
        val strMeasure19: Any, // null
        @Json(name = "strMeasure2")
        val strMeasure2: String, // 1/4 cup
        @Json(name = "strMeasure20")
        val strMeasure20: Any, // null
        @Json(name = "strMeasure3")
        val strMeasure3: String, // 3 cloves
        @Json(name = "strMeasure4")
        val strMeasure4: String, // 1 tin 
        @Json(name = "strMeasure5")
        val strMeasure5: String, // 1/2 teaspoon
        @Json(name = "strMeasure6")
        val strMeasure6: String, // 1/2 teaspoon
        @Json(name = "strMeasure7")
        val strMeasure7: String, // 6 leaves
        @Json(name = "strMeasure8")
        val strMeasure8: String, // spinkling
        @Json(name = "strMeasure9")
        val strMeasure9: String,
        @Json(name = "strSource")
        val strSource: Any, // null
        @Json(name = "strTags")
        val strTags: String, // Pasta,Curry
        @Json(name = "strYoutube")
        val strYoutube: String // https://www.youtube.com/watch?v=1IszT_guI08
    )
}