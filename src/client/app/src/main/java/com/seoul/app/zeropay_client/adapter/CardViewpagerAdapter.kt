package com.seoul.app.zeropay_client.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.seoul.app.zeropay_client.R

class CardViewpagerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        const val ADD_CARD_VIEW_TYPE = 1
        const val USER_CARD_VIEW_TYPE = 2
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            ADD_CARD_VIEW_TYPE -> {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.add_card_layout, parent, false)
                AddCardViewHolder(itemView = view)
            }

            USER_CARD_VIEW_TYPE -> {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.register_viewpager_item, parent, false)
                CardViewHolder(itemView = view)
            }

            else -> throw IllegalArgumentException("Invalid view type")
        }
    }

    override fun getItemCount(): Int {
        return 5
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder.itemViewType){
            ADD_CARD_VIEW_TYPE -> {

            }

            USER_CARD_VIEW_TYPE -> {

            }

        }
    }

    override fun getItemViewType(position: Int): Int {
        return if (position == 0) {
            ADD_CARD_VIEW_TYPE
        } else {
            USER_CARD_VIEW_TYPE
        }
    }

    inner class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)


    inner class AddCardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}