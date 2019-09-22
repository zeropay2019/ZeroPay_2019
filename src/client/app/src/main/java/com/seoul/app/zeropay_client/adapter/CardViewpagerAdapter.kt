package com.seoul.app.zeropay_client.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.seoul.app.zeropay_client.R
import com.seoul.app.zeropay_client.network.response.UserCardResponse
import kotlinx.android.synthetic.main.add_card_layout.view.*
import kotlinx.android.synthetic.main.register_viewpager_item.view.*

class CardViewpagerAdapter(private val clickListener: () -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var cardInfoList: ArrayList<UserCardResponse?> = ArrayList()

    companion object {
        const val ADD_CARD_VIEW_TYPE = 1
        const val USER_CARD_VIEW_TYPE = 2
    }

    init {
        cardInfoList.add(null)
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
        return cardInfoList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder.itemViewType){
            ADD_CARD_VIEW_TYPE -> {
                holder.itemView.add_card_button.setOnClickListener {
                    clickListener.invoke()
                }
            }

            USER_CARD_VIEW_TYPE -> {
                holder.itemView.bank_name_textView.text = cardInfoList[position]?.company
                holder.itemView.card_paymentMethodNum_textView.text = cardInfoList[position]?.cardNumber
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if (position == cardInfoList.size - 1) {
            ADD_CARD_VIEW_TYPE
        } else {
            USER_CARD_VIEW_TYPE
        }
    }

    inner class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    inner class AddCardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}