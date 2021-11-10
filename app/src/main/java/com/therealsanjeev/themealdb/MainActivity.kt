package com.therealsanjeev.themealdb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.therealsanjeev.themealdb.fragment.view.DetailMealFragment
import com.therealsanjeev.themealdb.fragment.view.SearchMealFragment
import com.therealsanjeev.themealdb.fragment.viewmodel.MainViewModel
import com.therealsanjeev.themealdb.utils.Status
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {


    private val mainViewModel:MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setCurrentFragment(SearchMealFragment())

//        datachecking()

    }

    private fun datachecking() {
        mainViewModel.categoryList.observe(this, Observer {

            when (it.status) {
                Status.SUCCESS -> {
                    Log.d("TAG", "datachecking: "+it)
//                    Toast.makeText(this, it.message, Toast.LENGTH_LONG).show()

                }
                Status.LOADING -> {
//                    Toast.makeText(this, it.message, Toast.LENGTH_LONG).show()
                    Log.d("TAG", "datachecking: "+it)

                }
                Status.ERROR -> {
                    Log.d("TAG", "datachecking: "+it)

//                    Toast.makeText(this, it.message, Toast.LENGTH_LONG).show()

                }
            }
        })
    }

    private fun setCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainer, fragment)
            commit()
        }
}