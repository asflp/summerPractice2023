package com.example.homework3

import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.example.homework3.databinding.FragmentSelectedSongBinding


class SelectedSongFragment : Fragment(R.layout.fragment_selected_song) {
    private var binding: FragmentSelectedSongBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentSelectedSongBinding.bind(view)

        val title = arguments?.getString(ARG_TITLE)
        binding!!.tvTitle.setText(title)
        val singer = arguments?.getString(ARG_SINGER)
        binding!!.tvSinger.setText(singer)
        val desc = arguments?.getString(ARG_DESCRIPTION)
        binding!!.tvDescription.setText(desc)
        val id = arguments?.getInt(ARG_ID)
        binding!!.tvId.setText(id.toString())
        val url = arguments?.getString(ARG_URL)
        binding!!.tvUrl.setText(url)
        val image = arguments?.getInt(ARG_PICTURE)
        val drawable = ContextCompat.getDrawable(requireContext(), image!!)
        binding!!.ivImage.setImageDrawable(drawable)

        binding!!.id.setText("Id:")
        binding!!.url.setText("URL:")
        binding!!.description.setText("Описание:")
        binding!!.singer.setText("Исполнитель:")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }


    companion object {

        private const val ARG_TITLE = "ARG_TITLE"
        private const val ARG_SINGER = "ARG_SINGER"
        private const val ARG_DESCRIPTION = "ARG_DESCRIPTION"
        private const val ARG_ID = "ARG_ID"
        private const val ARG_URL = "ARG_URL"
        private const val ARG_PICTURE = "ARG_PICTURE"

        fun createBundle(id: Int): Bundle {
            var song = SongRepository.findSongById(id)
            val bundle = Bundle()
            bundle.putString(ARG_TITLE, song.name)
            bundle.putString(ARG_SINGER, song.singer)
            bundle.putString(ARG_DESCRIPTION, song.description)
            bundle.putInt(ARG_ID, song.id)
            bundle.putString(ARG_URL, song.url)
            bundle.putInt(ARG_PICTURE, song.picture)
            return bundle
        }
    }
}