package com.example.morsecode.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.morsecode.R
import com.example.morsecode.databinding.FragmentDashboardBinding
import com.example.morsecode.ui.MyAdapter

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val recyclerView = root.findViewById<RecyclerView>(R.id.recycler_view)

        ///A-Z
        val itemList = listOf(
            MyAdapter.Item(R.drawable.naa, R.raw.aa,),
            MyAdapter.Item(R.drawable.nbb, R.raw.bb,),
            MyAdapter.Item(R.drawable.ncc, R.raw.cc,),
            MyAdapter.Item(R.drawable.ndd, R.raw.dd,),
            MyAdapter.Item(R.drawable.nee, R.raw.ee,),
            MyAdapter.Item(R.drawable.nff, R.raw.ff,),
            MyAdapter.Item(R.drawable.ngg, R.raw.gg,),
            MyAdapter.Item(R.drawable.nhh, R.raw.hh,),
            MyAdapter.Item(R.drawable.nii, R.raw.ii,),
            MyAdapter.Item(R.drawable.njj, R.raw.jj,),
            MyAdapter.Item(R.drawable.nkk, R.raw.kk,),
            MyAdapter.Item(R.drawable.nll, R.raw.ll,),
            MyAdapter.Item(R.drawable.nmm, R.raw.mm,),
            MyAdapter.Item(R.drawable.nnn, R.raw.nn,),
            MyAdapter.Item(R.drawable.noo, R.raw.oo,),
            MyAdapter.Item(R.drawable.npp, R.raw.pp,),
            MyAdapter.Item(R.drawable.nqq, R.raw.qq,),
            MyAdapter.Item(R.drawable.nrr, R.raw.rr,),
            MyAdapter.Item(R.drawable.nss, R.raw.ss,),
            MyAdapter.Item(R.drawable.ntt, R.raw.tt,),
            MyAdapter.Item(R.drawable.nuu, R.raw.uu,),
            MyAdapter.Item(R.drawable.nvv, R.raw.vv,),
            MyAdapter.Item(R.drawable.nww, R.raw.ww,),
            MyAdapter.Item(R.drawable.nxx, R.raw.xx,),
            MyAdapter.Item(R.drawable.nyy, R.raw.yy,),
            MyAdapter.Item(R.drawable.nzz, R.raw.zz,)
        )
        //val  layoutManager = LinearLayoutManager(this)

        val adapter = MyAdapter(itemList)
        recyclerView!!.layoutManager = LinearLayoutManager(root.context)
        //recyclerView!!.setLayoutManager(GridLayoutManager(root.context,2))
        recyclerView.adapter = adapter
//        val textView: TextView = binding.textDashboard
//        dashboardViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}