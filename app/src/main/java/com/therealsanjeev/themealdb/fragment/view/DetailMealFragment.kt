
package com.therealsanjeev.themealdb.fragment.view

import android.os.Binder
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.therealsanjeev.themealdb.R
import com.therealsanjeev.themealdb.databinding.FragmentDetailMealBinding
import com.therealsanjeev.themealdb.fragment.adpter.MealListAdapter
import com.therealsanjeev.themealdb.fragment.model.MealDetailsModel
import com.therealsanjeev.themealdb.fragment.model.MealsModel
import com.therealsanjeev.themealdb.fragment.viewmodel.MainViewModel
import com.therealsanjeev.themealdb.utils.Status
import org.koin.android.viewmodel.ext.android.viewModel

class DetailMealFragment : Fragment() {

    lateinit var model:MealsModel.Meal

    lateinit var binding:FragmentDetailMealBinding

    private val mainViewModel: MainViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentDetailMealBinding.inflate(layoutInflater)

        arguments?.getParcelable<MealsModel.Meal>("data")?.let { model ->
            this.model = model
        }
        mainViewModel.fetchCategoryDetails(model.idMeal)

        getMealDetails()

        return binding.root
    }

    private fun getMealDetails() {
        mainViewModel.categoryDetails.observe(requireActivity(), Observer {
            when (it.status) {

                Status.SUCCESS -> {

                    binding.apply {
                        roundProgress.visibility=View.GONE
                        clMealDetails.visibility=View.VISIBLE

                        val model=it.data as MealDetailsModel

                        tvMealName.text=model.meals[0].strMeal
                        tvInstructions.text=model.meals[0].strInstructions

                        Glide.with(ivMealImage)
                            .load(model.meals[0].strMealThumb)
                            .into(ivMealImage)


                        var ingradients=""
                        ingradients+=" *"+model.meals[0].strIngredient1
                        ingradients+=" *"+model.meals[0].strIngredient2
                        ingradients+=" *"+model.meals[0].strIngredient3
                        ingradients+=" *"+model.meals[0].strIngredient4
                        ingradients+=" *"+model.meals[0].strIngredient5
                        ingradients+=" *"+model.meals[0].strIngredient6
                        ingradients+=" *"+model.meals[0].strIngredient7
                        ingradients+=" *"+model.meals[0].strIngredient8
                        ingradients+=" *"+model.meals[0].strIngredient9
                        ingradients+=" *"+model.meals[0].strIngredient10
                        ingradients+=" *"+model.meals[0].strIngredient11
                        ingradients+=" *"+model.meals[0].strIngredient12
                        ingradients+=" *"+model.meals[0].strIngredient13
                        ingradients+=" *"+model.meals[0].strIngredient14
                        ingradients+=" *"+model.meals[0].strIngredient15
                        ingradients+=" *"+model.meals[0].strIngredient16
                        ingradients+=" *"+model.meals[0].strIngredient17
                        ingradients+=" *"+model.meals[0].strIngredient18
                        ingradients+=" *"+model.meals[0].strIngredient19
                        ingradients+=" *"+model.meals[0].strIngredient20

                        tvIngredientsName.text=ingradients
                    }
                    Log.d("TAG", "datachecking: "+it)
                }
                Status.LOADING -> {
                    binding.clMealDetails.visibility=View.GONE
                    binding.roundProgress.visibility=View.VISIBLE
                    Log.d("TAG", "datachecking: "+it)

                }
                Status.ERROR -> {
                    Log.d("TAG", "datachecking: "+it)
                    binding.roundProgress.visibility=View.GONE
                }
            }

        })
    }


}