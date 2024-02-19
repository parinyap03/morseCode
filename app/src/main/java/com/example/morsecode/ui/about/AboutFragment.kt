package com.example.morsecode.ui.about

import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.morsecode.R
import com.example.morsecode.databinding.FragmentAboutBinding
import com.example.morsecode.databinding.FragmentDashboardBinding
import com.example.morsecode.databinding.FragmentNotificationsBinding
import com.example.morsecode.ui.MyAdapter
import com.example.morsecode.ui.dashboard.DashboardViewModel
import com.example.morsecode.ui.notifications.Adapter2
import com.example.morsecode.ui.notifications.AdapterAbout
import com.example.morsecode.ui.notifications.NotificationsViewModel

class AboutFragment: Fragment() {
    private var _binding: FragmentAboutBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val AboutViewModel =
            ViewModelProvider(this).get(AboutViewModel::class.java)

        _binding = FragmentAboutBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val recyclerView = root.findViewById<RecyclerView>(R.id.recycler_view)
        var arrlmg = arrayOf<Int>(
            R.drawable.homeone,
            R.drawable.hometwo,
        )

        val adapter = AdapterAbout(arrlmg)
        recyclerView!!.layoutManager = LinearLayoutManager(root.context)
        //recyclerView!!.setLayoutManager(GridLayoutManager(root.context,2))
        recyclerView!!.adapter = adapter



        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}