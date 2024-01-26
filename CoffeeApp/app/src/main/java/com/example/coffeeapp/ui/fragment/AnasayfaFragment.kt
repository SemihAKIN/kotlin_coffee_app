package com.example.coffeeapp.ui.fragment

import android.os.Bundle
import android.provider.MediaStore.Images
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.coffeeapp.R
import com.example.coffeeapp.data.entity.Catalogs
import com.example.coffeeapp.data.entity.Places
import com.example.coffeeapp.databinding.FragmentAnasayfaBinding
import com.example.coffeeapp.ui.adapter.CatalogsAdapter
import com.example.coffeeapp.ui.adapter.PlaceAdapter

class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.toolbarAnasayfa.title = "Coffees App"


        binding.imageRv.layoutManager=StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)

        val imageList = ArrayList<Places>()
        val p1 = Places(1, "coffee_1")
        val p2 = Places(2, "coffee_2")
        val p3 = Places(3, "coffee_3")

        imageList.add(p1)
        imageList.add(p2)
        imageList.add(p3)


        val imageAdapter = PlaceAdapter(requireContext(),imageList)
        binding.imageRv.adapter = imageAdapter



        binding.catalogRv.layoutManager=StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        val catalogList = ArrayList<Catalogs>()
        val c1 = Catalogs(1,"Hot Coffees","hot_coffee")
        val c2 = Catalogs(2,"Iced Coffees","iced_coffee")
        val c3 = Catalogs(3,"Frappucinos","frappuccino")
        val c4 = Catalogs(4,"Hot Teas","hot_tea")
        val c5 = Catalogs(5,"Milkshakes","milkshake")
        val c6 = Catalogs(6,"Cakes","cake")

        catalogList.add(c1)
        catalogList.add(c2)
        catalogList.add(c3)
        catalogList.add(c4)
        catalogList.add(c5)
        catalogList.add(c6)

        val catalogsAdapter = CatalogsAdapter(requireContext(),catalogList)
        binding.catalogRv.adapter = catalogsAdapter



        return binding.root
    }
}