package com.example.homework2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.example.homework2.databinding.FragmentNewsBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class NewsFragment : Fragment(R.layout.fragment_news) {

    private var binding: FragmentNewsBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentNewsBinding.bind(view)

        binding?.run{
            button.setOnClickListener{
                findNavController().navigate(
                    R.id.action_newsFragment_to_differentFragment,
                    DifferentFragment.createBundle("News Fragment")
                )
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}