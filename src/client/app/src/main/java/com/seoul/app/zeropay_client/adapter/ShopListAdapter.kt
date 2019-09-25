package com.seoul.app.zeropay_client.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.seoul.app.zeropay_client.R
import com.seoul.app.zeropay_client.network.response.ShopListResponse
import kotlinx.android.synthetic.main.shoplist_layout.view.*

class ShopListAdapter(private val shopListResponse: ArrayList<ShopListResponse>): RecyclerView.Adapter<ShopListAdapter.ShopHolder>(){

    override fun getItemCount(): Int {
        return shopListResponse.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShopHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.shoplist_layout, parent, false)
        return ShopHolder(view)
    }

    override fun onBindViewHolder(holder: ShopHolder, position: Int) {
        val item = shopListResponse[position]
        val listener = View.OnClickListener {
            Log.e("onClick", item.address)
        }
        holder.apply {
            bind(listener, item)
            itemView.tag = item
        }
    }

    inner class ShopHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private var view: View = itemView
        fun bind(listener: View.OnClickListener, item: ShopListResponse) {
            view.shopAddress.text = item.address
            view.shopCategory.text = item.category
            view.shopName.text = item.marketName
            view.setOnClickListener(listener)
        }
    }
}