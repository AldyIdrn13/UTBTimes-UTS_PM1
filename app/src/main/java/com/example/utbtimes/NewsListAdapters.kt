package com.example.utbtimes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsListAdapter(private val list: List<NewsItem>) : RecyclerView.Adapter<NewsListAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val newsTitle: TextView = itemView.findViewById(R.id.newsTitle)
        val newsTime: TextView = itemView.findViewById(R.id.newsTime)
        val newsImage: ImageView = itemView.findViewById(R.id.newsImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val newsItem = list[position]
        holder.newsTitle.text = newsItem.title
        holder.newsTime.text = newsItem.uploadTime
        holder.newsImage.setImageResource(newsItem.imageResId)
    }

    override fun getItemCount(): Int = list.size
}
