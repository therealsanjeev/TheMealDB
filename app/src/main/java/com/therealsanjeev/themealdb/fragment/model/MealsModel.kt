package com.therealsanjeev.themealdb.fragment.model


import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize
@Parcelize
data class MealsModel(
    @Json(name = "meals")
    val meals: List<Meal>
):Parcelable {
    @Parcelize
    data class Meal(
        @Json(name = "idMeal")
        val idMeal: String, // 53049
        @Json(name = "strMeal")
        val strMeal: String, // Apam balik
        @Json(name = "strMealThumb")
        val strMealThumb: String // https://www.themealdb.com/images/media/meals/adxcbq1619787919.jpg
    ):Parcelable
}