package com.example.homework3

import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.homework3.databinding.ItemSongBinding

class SongItem(
    private val binding: ItemSongBinding,
    private val onItemClick: (Song) -> Unit,
):ViewHolder(binding.root){

    fun onBind(song: Song){
        binding.run{
            tvTitle.text = song.name
            tvSinger.text= song.singer
            picture.setImageResource(song.picture)

            root.setOnClickListener {
                onItemClick(song)
            }
        }
    }
}
