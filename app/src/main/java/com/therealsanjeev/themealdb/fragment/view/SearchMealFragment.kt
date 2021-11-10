package com.therealsanjeev.themealdb.fragment.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.therealsanjeev.themealdb.R
import com.therealsanjeev.themealdb.databinding.FragmentSearchMealBinding
import com.therealsanjeev.themealdb.fragment.adpter.MealListAdapter
import com.therealsanjeev.themealdb.fragment.model.MealsModel
import com.therealsanjeev.themealdb.fragment.viewmodel.MainViewModel
import com.therealsanjeev.themealdb.utils.CommonUtils
import com.therealsanjeev.themealdb.utils.Status
import org.koin.android.viewmodel.ext.android.viewModel

class SearchMealFragment() : Fragment(),MealListAdapter.itemClicked {

    private val mainViewModel: MainViewModel by viewModel()

    val rnds = (0..13).random()
    val categorys:Array<String> =arrayOf(
        "Beef", "Chicken","Dessert","Lamb","Miscellaneous","Pasta","Pork","Seafood","Side",
        "Starter","Vegan","Vegetarian","Breakfast","Goat"
        )
    lateinit var binding:FragmentSearchMealBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainViewModel.fetchCategoryList(categorys[rnds])
        datachecking()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentSearchMealBinding.inflate(layoutInflater)

        binding.apply {
            ivSearchMeals.setOnClickListener {
                val searchMeal=etSearch.text.toString()
                if(!searchMeal.isNullOrEmpty()){
                    Bundle().apply {
                        putString("searchData",searchMeal )

                        val ft: FragmentTransaction = requireFragmentManager().beginTransaction()
                        val fg=DetailMealFragment();
                        fg.arguments=this
                        ft.replace(R.id.fragmentContainer, fg, "NewFragmentTag")
                        ft.addToBackStack(null);
                        ft.commit()

                    }

                }else{

                }
            }
        }

        return binding.root
    }

    private fun datachecking() {
        mainViewModel.categoryList.observe(requireActivity(), Observer {
            when (it.status) {

                Status.SUCCESS -> {

                    binding.apply {
                        roundProgress.visibility=View.GONE
                        rvMeals.visibility=View.VISIBLE
                        rvMeals.apply {
                            layoutManager=LinearLayoutManager(requireActivity())
                            adapter=MealListAdapter(it.data!!,this@SearchMealFragment)
                        }
                    }
                    Log.d("TAG", "datachecking: "+it)
                }
                Status.LOADING -> {
                    binding.rvMeals.visibility=View.GONE
                    binding.roundProgress.visibility=View.VISIBLE
                    Log.d("TAG", "datachecking: "+it)

                }
                Status.ERROR -> {
                    Log.d("TAG", "datachecking: "+it)
                    binding.apply {
                        roundProgress.visibility=View.GONE
                        ivNoInternet.visibility=View.VISIBLE

                    }
                    Toast.makeText(requireActivity(), it.message, Toast.LENGTH_LONG).show()
                }
            }
        })
    }

    override fun onClick(item: MealsModel.Meal) {
        Bundle().apply {
            putParcelable("data", item)

            val ft: FragmentTransaction = requireFragmentManager().beginTransaction()
            val fg=DetailMealFragment();
            fg.arguments=this
            ft.replace(R.id.fragmentContainer, fg, "NewFragmentTag")
            ft.addToBackStack(null);
            ft.commit()

        }
    }

    override fun onResume() {
        super.onResume()
        datachecking()
    }
}