package com.example.academylesson

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.academylesson.databinding.ItemMusicBinding
import com.example.academylesson.models.Music

class MusicAdapter(
    val dd:String
) :
    RecyclerView.Adapter<MusicAdapter.MusicViewHolder>() {
    private val musicList = mutableListOf<Music>()

    fun updateList(newMusicList: List<Music>) {
        musicList.clear()
        musicList.addAll(newMusicList)
        notifyDataSetChanged()
    }


    inner class MusicViewHolder(
        private val binding: ItemMusicBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bindMusic(music: Music){
//            binding.titleTextView.text=music.title
//            binding.authorTextView.text=music.author

        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MusicViewHolder {
        val binding = ItemMusicBinding.bind(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_music,
                parent,
                false
            )
        )
        val viewHolder=MusicViewHolder(binding)
        return viewHolder

        TODO("Not yet implemented")
    }
    override fun getItemCount(): Int = musicList.size


    override fun onBindViewHolder(holder: MusicViewHolder,
                                  position: Int
    ) {
      holder.bindMusic(musicList[position])

    }




}