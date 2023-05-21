package com.example.dongsan2mong

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.dongsan2mong.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var bnv: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        bnv = binding.bottomNav

        init()
    }

    private fun init() {
        // 초기 화면 MapFragment()로
        supportFragmentManager.beginTransaction().replace(binding.frameLayout.id, MapFragment()).commitAllowingStateLoss()

        bnv.setOnItemSelectedListener { item ->
            changeFragment(
                when (item.itemId) {
                    R.id.mapMenu -> {
                        MapFragment()
                    }
                    R.id.wishlistMenu -> {
                        WishlistFragment()
                    }
                    R.id.comparisonMenu -> {
                        RealestatecompareFragment()
                    }
                    else -> {
                        PlannerFragment()
                    }
                }
            )
            true
        }
    }

    private fun changeFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(binding.frameLayout.id, fragment)
            .commit()
    }
}