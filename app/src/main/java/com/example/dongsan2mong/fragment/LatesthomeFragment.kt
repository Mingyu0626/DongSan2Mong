package com.example.dongsan2mong.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dongsan2mong.adapter.HouseInfoDataAdapter
import com.example.dongsan2mong.data.HouseInfoData
import com.example.dongsan2mong.databinding.FragmentLatesthomeBinding
import com.example.dongsan2mong.databinding.RowHouseinfoBinding

class LatesthomeFragment : Fragment() {
    lateinit var binding: FragmentLatesthomeBinding
    lateinit var adapter: HouseInfoDataAdapter

    val data: ArrayList<HouseInfoData> = ArrayList()
    val selected: ArrayList<Boolean> = ArrayList()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLatesthomeBinding.inflate(inflater, container, false)
        initRecyclerView()
        initData()
        return binding.root
    }

    fun initData() {
        data.add(HouseInfoData())
        data.add(
            HouseInfoData(
                type = "월세",
                price = "500/74",
                space = "33.06m^2",
                floor = "1층",
                area = "광진구 구의동",
                roomNum = "투룸",
                imgURL = ""
            )
        )
    }

    fun initRecyclerView() {
        binding.recyclerViewLatestHome.layoutManager = LinearLayoutManager(
            requireContext(),
            LinearLayoutManager.VERTICAL, false
        )
        adapter = HouseInfoDataAdapter(data, selected)
        adapter.itemClickListener = object : HouseInfoDataAdapter.OnItemClickListener {
            override fun OnItemClick(
                data: HouseInfoData,
                binding: RowHouseinfoBinding,
                position: Int
            ) {

            }
        }
        binding.recyclerViewLatestHome.adapter = adapter

    }
}