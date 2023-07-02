package com.example.homework3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.homework3.databinding.FragmentListBinding

class ListFragment : Fragment(R.layout.fragment_list){

    private var binding: FragmentListBinding? = null
    private var adapter: SongAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentListBinding.bind(view)

        initAdapter()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    private fun initAdapter() {
        adapter = SongAdapter(
            list = SongRepository.list,
            onItemClick = { song ->
                findNavController().navigate(
                    R.id.action_listFragment2_to_selectedSongFragment,
                    SelectedSongFragment.createBundle(song)
                )
            }
        )
        binding?.rvSongs?.adapter = adapter
    }

}