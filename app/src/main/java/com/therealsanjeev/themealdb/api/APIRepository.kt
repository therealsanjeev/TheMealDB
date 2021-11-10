package com.therealsanjeev.themealdb.api

import com.therealsanjeev.themealdb.fragment.model.MealDetailsModel
import com.therealsanjeev.themealdb.fragment.model.MealSearchDetailsModel
import com.therealsanjeev.themealdb.fragment.model.MealsModel
import retrofit2.Response

interface APIRepository {

    suspend fun getCategoryItemsList(category: String): Response<MealsModel>

    suspend fun getCategoryItemDetails(categoryName: String): Response<MealDetailsModel>

    suspend fun getSearchedItemDetails(search: String): Response<MealSearchDetailsModel>

}