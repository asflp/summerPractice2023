package com.example.homework2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.homework2.databinding.FragmentMessageBinding
import com.example.homework2.databinding.FragmentNewsBinding

class MessageFragment : Fragment(R.layout.fragment_message) {

    private var binding: FragmentMessageBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMessageBinding.bind(view)

        binding?.run{
            button.setOnClickListener{
                findNavController().navigate(
                    R.id.action_messageFragment_to_differentFragment,
                    DifferentFragment.createBundle("Message Fragment")
                )
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}