package com.example.morsecode.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.morsecode.R
import com.example.morsecode.databinding.FragmentNotificationsBinding
import com.example.morsecode.ui.MyAdapter

class NotificationsFragment : Fragment() {

    private var _binding: FragmentNotificationsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val notificationsViewModel =
            ViewModelProvider(this).get(NotificationsViewModel::class.java)

        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        val textView: TextView = binding.textNotifications
//        notificationsViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }

        //ก-ฮ
        val recyclerView = root.findViewById<RecyclerView>(R.id.recycler_view)
        var arrlmg = arrayOf<Int>(
            R.drawable.n00,
            R.drawable.n01,
            R.drawable.n03,
            R.drawable.n04,
            R.drawable.n05,
            R.drawable.n06,

            R.drawable.n07,
            R.drawable.n08,
            R.drawable.n09,
            R.drawable.n10,
            R.drawable.n11,
            R.drawable.n12,

            R.drawable.n13,
            R.drawable.n14,
            R.drawable.n15,
            R.drawable.n16,
            R.drawable.n17,
            R.drawable.n18,

            R.drawable.n19,
            R.drawable.n20,
            R.drawable.n21,
            R.drawable.n22,
            R.drawable.n23,
            R.drawable.n24,

            R.drawable.n25,
            R.drawable.n26,
            R.drawable.n27,
            R.drawable.n28,
            R.drawable.n29,
            R.drawable.n30,

        )


        val adapter = Adapter2(arrlmg)
        recyclerView!!.layoutManager = LinearLayoutManager(root.context)
        //recyclerView!!.setLayoutManager(GridLayoutManager(root.context,2))
        recyclerView.adapter = adapter
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}