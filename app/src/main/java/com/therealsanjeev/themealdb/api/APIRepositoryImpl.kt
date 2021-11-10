package com.therealsanjeev.themealdb.api

import com.therealsanjeev.themealdb.fragment.model.MealDetailsModel
import com.therealsanjeev.themealdb.fragment.model.MealSearchDetailsModel
import com.therealsanjeev.themealdb.fragment.model.MealsModel
import retrofit2.Response

class APIRepositoryImpl(private val api: API) :APIRepository{


    override suspend fun getCategoryItemsList(category: String): Response<MealsModel> {
        return api.getCategoryItemsList(category)
    }

    override suspend fun getCategoryItemDetails(categoryName: String): Response<MealDetailsModel> {
        return api.getCategoryItemDetails(categoryName)
    }

    override suspend fun getSearchedItemDetails(search: String): Response<MealSearchDetailsModel> {
        return api.getSearchedItemDetails(search)
    }
}