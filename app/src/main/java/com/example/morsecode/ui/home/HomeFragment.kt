package com.example.morsecode.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.morsecode.R
import com.example.morsecode.databinding.FragmentHomeBinding
import com.example.morsecode.ui.MyAdapter

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        val textView: TextView = binding.textHome
//        homeViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }
        ///Number
        val recyclerView = root.findViewById<RecyclerView>(R.id.recycler_view)
        val itemList = listOf(
            MyAdapter.Item(R.drawable.nzero, R.raw.zero_s),
            MyAdapter.Item(R.drawable.none, R.raw.one_s),
            MyAdapter.Item(R.drawable.ntwo, R.raw.two_s),
            MyAdapter.Item(R.drawable.nthree, R.raw.three_s),
            MyAdapter.Item(R.drawable.nfour, R.raw.four_s),
            MyAdapter.Item(R.drawable.nfive, R.raw.five_s),
            MyAdapter.Item(R.drawable.nsix, R.raw.six_s),
            MyAdapter.Item(R.drawable.nseven, R.raw.seven_s),
            MyAdapter.Item(R.drawable.neight, R.raw.eight_s),
            MyAdapter.Item(R.drawable.nnine, R.raw.nine_s)
        )


        //val  layoutManager = LinearLayoutManager(this)S

        val adapter = MyAdapter(itemList)
        recyclerView!!.layoutManager = LinearLayoutManager(root.context)
        //recyclerView!!.setLayoutManager(GridLayoutManager(root.context,2))
        //recyclerView.layoutManager = layoutManager

        recyclerView.adapter = adapter
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}