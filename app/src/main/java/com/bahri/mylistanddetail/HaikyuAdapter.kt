package com.bahri.mylistanddetail

import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HaikyuAdapter(val listHaikyu: ArrayList<Haikyu>): RecyclerView.Adapter<HaikyuAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater
            .from(viewGroup.context)
            .inflate(R.layout.item_list, viewGroup,false)
        return ListViewHolder(view)
    }

    inner class ListViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var tvName : TextView = itemView.findViewById(R.id.tvName)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvDesc : TextView = itemView.findViewById(R.id.tvDesc)
        var tvRate : TextView = itemView.findViewById(R.id.tvRating)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val haikyu = listHaikyu[position]

        holder.tvName.text = haikyu.name
        holder.imgPhoto.setImageResource(haikyu.photo)
        holder.tvDesc.text = haikyu.desc
        holder.tvRate.text = haikyu.rate

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener{
            val moveDetail = Intent(mContext, HaikyuDetail::class.java)
            moveDetail.putExtra(HaikyuDetail.EXTRA_NAME, haikyu.name)
            moveDetail.putExtra(HaikyuDetail.EXTRA_PHOTO, haikyu.photo)
            moveDetail.putExtra(HaikyuDetail.EXTRA_DESCRIPSI, haikyu.desc)
            moveDetail.putExtra(HaikyuDetail.EXTRA_RATE, haikyu.rate)
            mContext.startActivity(moveDetail)
        }
    }

    override fun getItemCount(): Int {
        return listHaikyu.size
    }

    @SuppressLint("notifyDataSetChanged")
    fun setData(data: List<Haikyu>){
        listHaikyu.clear()
        listHaikyu.addAll(data)
        notifyDataSetChanged()
    }

}