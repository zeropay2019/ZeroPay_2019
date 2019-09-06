package com.seoul.app.zeropay_client.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.seoul.app.zeropay_client.R

class TransactionAdapter:  RecyclerView.Adapter<TransactionAdapter.TransactionViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.transaction_item, parent, false)
        return TransactionViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: TransactionViewHolder, position: Int) {

    }

    class TransactionViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    }

}