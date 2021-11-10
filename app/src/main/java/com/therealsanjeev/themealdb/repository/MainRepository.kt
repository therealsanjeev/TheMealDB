package com.therealsanjeev.themealdb.repository

import com.therealsanjeev.themealdb.api.APIRepository

class MainRepository (private val apiHelper: APIRepository) {

    suspend fun getCategoryItemsList(category: String) =  apiHelper.getCategoryItemsList(category)

    suspend fun getCategoryItemDetails(categoryName: String) =  apiHelper.getCategoryItemDetails(categoryName)

    suspend fun getSearchedItemDetails(search: String) =  apiHelper.getSearchedItemDetails(search)

}