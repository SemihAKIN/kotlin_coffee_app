package com.example.coffeeapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.coffeeapp.data.entity.Catalogs
import com.example.coffeeapp.databinding.CardDesignBinding

class CatalogsAdapter(var mContext:Context, var catalogsList:List<Catalogs>)
    : RecyclerView.Adapter<CatalogsAdapter.CardDesignTutucu>() {

    inner class CardDesignTutucu(var tasarim:CardDesignBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignTutucu {
        val binding = CardDesignBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return CardDesignTutucu(binding)
    }

    override fun onBindViewHolder(holder: CardDesignTutucu, position: Int) {
        val catalog = catalogsList.get(position)

        val t = holder.tasarim

        t.imageViewCatalog.setImageResource(mContext.resources.getIdentifier(catalog.image,"drawable", mContext.packageName))
        t.catalogTitle.text = "${catalog.title}"
    }

    override fun getItemCount(): Int {
        return catalogsList.size
    }
}