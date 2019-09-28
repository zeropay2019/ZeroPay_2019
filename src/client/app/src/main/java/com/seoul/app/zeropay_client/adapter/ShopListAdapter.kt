package com.seoul.app.zeropay_client.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.seoul.app.zeropay_client.R
import com.seoul.app.zeropay_client.network.response.ShopListResponse
import kotlinx.android.synthetic.main.shoplist_layout.view.*

class ShopListAdapter(private val clickListener: (ShopListResponse) -> Unit): RecyclerView.Adapter<ShopListAdapter.ShopHolder>(){
    private var shopListResponse: ArrayList<ShopListResponse> = ArrayList()

    fun updateMap(shopListResponse: ArrayList<ShopListResponse>){
        this.shopListResponse.clear()
        this.shopListResponse.addAll(shopListResponse)
        notifyDataSetChanged()
    }
    override fun getItemCount(): Int {
        return shopListResponse.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShopHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.shoplist_layout, parent, false)
        return ShopHolder(view)
    }

    override fun onBindViewHolder(holder: ShopHolder, position: Int) {
        val item = shopListResponse[position]
        holder.bind(item)
        holder.itemView.shopList_container.setOnClickListener {
            clickListener.invoke(shopListResponse[position])
        }
    }

    inner class ShopHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private var view: View = itemView
        fun bind(item: ShopListResponse) {
            view.shopAddress.text = item.address
            view.shopCategory.text = item.category
            view.shopName.text = item.marketName
        }
    }
}