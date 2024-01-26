package com.example.coffeeapp.ui.adapter

import android.content.Context
import android.provider.MediaStore.Images
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.coffeeapp.data.entity.Places
import com.example.coffeeapp.databinding.ImageCardDesignBinding

class PlaceAdapter(var mContext: Context, var imagesList: List<Places>)
    : RecyclerView.Adapter<PlaceAdapter.ImageCardDesignTutucu>() {
    inner class ImageCardDesignTutucu(var tasarim:ImageCardDesignBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageCardDesignTutucu {
        val binding = ImageCardDesignBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return ImageCardDesignTutucu(binding)
    }


    override fun onBindViewHolder(holder: ImageCardDesignTutucu, position: Int) {
        val placeImage = imagesList.get(position)
        val t = holder.tasarim
        t.imageViewPlace.setImageResource(mContext.resources.getIdentifier(placeImage.image, "drawable", mContext.packageName))
    }

    override fun getItemCount(): Int {
        return imagesList.size
    }
}