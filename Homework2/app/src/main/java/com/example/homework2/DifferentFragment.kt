package com.example.homework2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.homework2.databinding.FragmentDifferentBinding
import com.example.homework2.databinding.FragmentMusicBinding
import com.google.android.material.snackbar.Snackbar

class DifferentFragment : Fragment(R.layout.fragment_different) {

    private var binding: FragmentDifferentBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentDifferentBinding.bind(view)

        getNotification()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    companion object {

        private const val ARG_FRAGMENT = "ARG_FRAGMENT"

        fun createBundle(fragment: String): Bundle {
            val bundle = Bundle()
            bundle.putString(ARG_FRAGMENT, fragment)
            return bundle
        }
    }

    fun getNotification(){
        val fragment = arguments?.getString(ARG_FRAGMENT)
        Snackbar.make(binding!!.root, "from $fragment",
            Snackbar.LENGTH_SHORT).setAnchorView(R.id.bnv_main).show()
    }
}