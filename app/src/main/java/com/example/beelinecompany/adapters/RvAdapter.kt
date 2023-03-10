package com.example.beelinecompany.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.beelinecompany.databinding.ItemRvBinding
import com.example.beelinecompany.models.MyTemplate

class TemAdapter(val  list:List<MyTemplate>, val rvClick: RvClick):RecyclerView.Adapter<TemAdapter.Vh>()  {

    inner class Vh(var itemRvBinding: ItemRvBinding):RecyclerView.ViewHolder(itemRvBinding.root){

        fun onBind(myTemplate: MyTemplate, position:Int){
            itemRvBinding.tvName.text = myTemplate.name
            itemRvBinding.tvCode.text = myTemplate.code
            itemRvBinding.tvAbout.text = myTemplate.price

            itemRvBinding.root.setOnClickListener { rvClick.itemClick(myTemplate)}
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemRvBinding.inflate(LayoutInflater.from(parent.context),parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int = list.size
}
interface RvClick{
    fun itemClick(myTemplate: MyTemplate)
}