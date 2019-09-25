package com.seoul.app.zeropay_client.adapter

import android.content.Context
import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.seoul.app.zeropay_client.R
import com.seoul.app.zeropay_client.network.response.UserCardResponse
import kotlinx.android.synthetic.main.add_card_layout.view.*
import kotlinx.android.synthetic.main.register_viewpager_item.view.*

class CardViewpagerAdapter(
    private val clickListener: (ArrayList<UserCardResponse?>) -> Unit,
    val context: Context,
    private var cardInfoList: ArrayList<UserCardResponse?>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    companion object {
        const val ADD_CARD_VIEW_TYPE = 1
        const val USER_CARD_VIEW_TYPE = 2
    }

    init {
        cardInfoList.add(0, null)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            ADD_CARD_VIEW_TYPE -> {
                val view = LayoutInflater.from(context)
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
        when (holder.itemViewType) {
            ADD_CARD_VIEW_TYPE -> {
                holder.itemView.add_card_button.setOnClickListener {
                    clickListener.invoke(cardInfoList)
                }
            }
            USER_CARD_VIEW_TYPE -> {
                Log.e(
                    "card name",
                    "position " + position + " , " + cardInfoList[position]?.company + " size-> " + cardInfoList.size
                )
                holder.itemView.card_paymentMethodNum_textView.text =
                    cardInfoList[position]?.cardNumber
                setCardColor(holder, cardInfoList[position]?.company.toString())

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

    private fun setCardColor(holder: RecyclerView.ViewHolder, cardName: String) {
        when (cardName) {
            "신한" -> {
                (holder as CardViewHolder).itemView.card_brand_ImageView.setImageResource(R.drawable.shinhan)
                holder.itemView.card_main.setBackgroundResource(R.color.ShinHan_card)
            }
            "삼성" -> {
                (holder as CardViewHolder).itemView.card_brand_ImageView.setImageResource(R.drawable.samsung)
                holder.itemView.card_main.setBackgroundResource(R.color.SamSung_card)
            }
            "현대" -> {
                (holder as CardViewHolder).itemView.card_brand_ImageView.setImageResource(R.drawable.hyundai)
                holder.itemView.card_main.setBackgroundResource(R.color.HyunDai_card)
            }
            "BC" -> {
                (holder as CardViewHolder).itemView.card_brand_ImageView.setImageResource(R.drawable.bc)
                holder.itemView.card_main.setBackgroundResource(R.color.BC_card)
            }
            "KB국민" -> {
                (holder as CardViewHolder).itemView.card_brand_ImageView.setImageResource(R.drawable.kb)
                holder.itemView.card_main.setBackgroundResource(R.color.KB_card)
                holder.itemView.card_paymentMethodNum_textView.setTextColor(Color.BLACK)
                holder.itemView.card_pay_type.setTextColor(Color.BLACK)
            }
            "하나" -> {
                (holder as CardViewHolder).itemView.card_brand_ImageView.setImageResource(R.drawable.hana)
                holder.itemView.card_main.setBackgroundResource(R.color.Hana_card)
            }
            "롯데" -> {
                (holder as CardViewHolder).itemView.card_brand_ImageView.setImageResource(R.drawable.lotte)
                holder.itemView.setBackgroundResource(R.color.Lotte_card)
            }
            "농협" -> {
                (holder as CardViewHolder).itemView.card_brand_ImageView.setImageResource(R.drawable.nh)
                holder.itemView.setBackgroundResource(R.color.NH_card)
            }
            "시티" -> {
                (holder as CardViewHolder).itemView.card_brand_ImageView.setImageResource(R.drawable.citi)
                holder.itemView.setBackgroundResource(R.color.Citi_bank)
            }
            "카카오뱅크" -> {
                (holder as CardViewHolder).itemView.card_brand_ImageView.setImageResource(R.drawable.kakao)
                holder.itemView.card_main.setBackgroundResource(R.color.Kakao_bank)
                holder.itemView.card_paymentMethodNum_textView.setTextColor(Color.DKGRAY)
                holder.itemView.card_pay_type.setTextColor(Color.BLACK)
            }
        }
    }
}