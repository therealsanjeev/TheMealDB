package com.therealsanjeev.themealdb.api

import com.therealsanjeev.themealdb.fragment.model.MealDetailsModel
import com.therealsanjeev.themealdb.fragment.model.MealSearchDetailsModel
import com.therealsanjeev.themealdb.fragment.model.MealsModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface API {

    @GET("v1/1/filter.php")
    suspend fun getCategoryItemsList(@Query("c") categoryList: String): Response<MealsModel>

    @GET("v1/1/lookup.php")
    suspend fun getCategoryItemDetails(@Query("i") category: String): Response<MealDetailsModel>

    @GET("v1/1/search.php")
    suspend fun getSearchedItemDetails(@Query("s") search: String): Response<MealSearchDetailsModel>

}