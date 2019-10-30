package com.seoul.app.zeropay_client.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.seoul.app.zeropay_client.R
import com.seoul.app.zeropay_client.model.Info
import kotlinx.android.synthetic.main.info_recyclerview_item.view.*

class InfoListAdapter(private val clickListener: (Info) -> Unit, private val info: ArrayList<Info>) :
    RecyclerView.Adapter<InfoListAdapter.InfoHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InfoHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.info_recyclerview_item, parent, false)
        return InfoHolder(view)
    }

    override fun getItemCount(): Int {
        return info.size
    }


    override fun onBindViewHolder(holder: InfoHolder, position: Int) {
        val item = info[position]
        holder.apply {
            bind(item)
            holder.itemView.info_container_view.setOnClickListener {
                clickListener.invoke(info[position])
            }
            itemView.tag = item
        }
    }

    inner class InfoHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private var view: View = itemView
        fun bind(item: Info) {
            view.info_title.text = item.title
        }
    }
}
