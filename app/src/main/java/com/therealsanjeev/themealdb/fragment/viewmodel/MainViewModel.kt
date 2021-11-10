package com.therealsanjeev.themealdb.fragment.viewmodel

import androidx.lifecycle.*
import com.therealsanjeev.themealdb.fragment.model.MealDetailsModel
import com.therealsanjeev.themealdb.fragment.model.MealSearchDetailsModel
import com.therealsanjeev.themealdb.fragment.model.MealsModel
import com.therealsanjeev.themealdb.repository.MainRepository
import com.therealsanjeev.themealdb.utils.NetworkHelper
import com.therealsanjeev.themealdb.utils.Resource
import kotlinx.coroutines.launch

class MainViewModel(private val mainRepository: MainRepository, private val networkHelper: NetworkHelper) : ViewModel() {



    private val _categoryList=MutableLiveData<Resource<MealsModel>>()
    val categoryList:LiveData<Resource<MealsModel>> get()= _categoryList

    fun fetchCategoryList(category: String) {
      viewModelScope.launch {
          _categoryList.postValue(Resource.loading(null))
          if (networkHelper.isNetworkConnected()){
              mainRepository.getCategoryItemsList(category).let {
                  if(it.isSuccessful){
                      _categoryList.postValue(Resource.success(it.body()))
                  }else{
                      _categoryList.postValue(Resource.error(it.errorBody().toString(),null))
                  }
              }
          }else{
              _categoryList.postValue(Resource.error("No internet connection", null))
          }
      }
    }

    private val _categoryDetails=MutableLiveData<Resource<MealDetailsModel>>()
    val categoryDetails:LiveData<Resource<MealDetailsModel>> get()= _categoryDetails

     fun fetchCategoryDetails(category: String) {
        viewModelScope.launch {
            _categoryDetails.postValue(Resource.loading(null))
            if (networkHelper.isNetworkConnected()){
                mainRepository.getCategoryItemDetails(category).let {
                    if(it.isSuccessful){
                        _categoryDetails.postValue(Resource.success(it.body()))
                    }else{
                        _categoryDetails.postValue(Resource.error(it.errorBody().toString(),null))
                    }
                }
            }else{
                _categoryDetails.postValue(Resource.error("No internet connection", null))
            }
        }
    }


    private val _searchItemDetails=MutableLiveData<Resource<MealSearchDetailsModel>>()
    val searchItemDetails:LiveData<Resource<MealSearchDetailsModel>> get()= _searchItemDetails

     fun fetchSearchItemDetails(search: String) {
        viewModelScope.launch {
            _searchItemDetails.postValue(Resource.loading(null))
            if (networkHelper.isNetworkConnected()){
                mainRepository.getSearchedItemDetails(search).let {
                    if(it.isSuccessful){
                        _searchItemDetails.postValue(Resource.success(it.body()))
                    }else{
                        _searchItemDetails.postValue(Resource.error(it.errorBody().toString(),null))
                    }
                }
            }else{
                _searchItemDetails.postValue(Resource.error("No internet connection", null))
            }
        }
    }

}