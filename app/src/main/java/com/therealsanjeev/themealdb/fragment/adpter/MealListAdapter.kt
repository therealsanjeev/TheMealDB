package com.therealsanjeev.themealdb.fragment.adpter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.therealsanjeev.themealdb.databinding.ItemMealBinding
import com.therealsanjeev.themealdb.fragment.model.MealsModel

class MealListAdapter(private val meals: MealsModel, private val listner:itemClicked) : RecyclerView.Adapter<MealListAdapter.DataViewHolder>() {

    inner class DataViewHolder(private val binding: ItemMealBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(meal: MealsModel.Meal) {

            binding.apply {

                tvProductName.text=meal.strMeal?:""
                Glide.with(ivProductImage)
                    .load(meal.strMealThumb)
                    .into(ivProductImage)

                clMeal.setOnClickListener{
                    listner.onClick(meal)
                }
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):DataViewHolder{
        val binding=ItemMealBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return DataViewHolder(binding)

    }

    override fun getItemCount(): Int = meals.meals.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) =
        holder.bind(meals.meals[position])

    interface itemClicked{
        fun onClick(item:MealsModel.Meal)
    }
}