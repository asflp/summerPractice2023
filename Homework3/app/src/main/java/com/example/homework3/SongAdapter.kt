package com.example.homework3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework3.databinding.ItemSongBinding

class SongAdapter(
    private var list: List<Song>,
    private val onItemClick: (Song) -> Unit,
): RecyclerView.Adapter<SongItem>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SongItem = SongItem(
        binding = ItemSongBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false,
        ),
        onItemClick = onItemClick,
    )

    override fun onBindViewHolder(holder: SongItem, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}