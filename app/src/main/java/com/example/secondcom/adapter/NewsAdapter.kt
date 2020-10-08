package com.example.secondcom.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.secondcom.R
import com.example.secondcom.model.News
import kotlinx.android.synthetic.main.item_berita.view.*

class NewsAdapter(private val context: Context, private val listNews: List<News>)
    : RecyclerView.Adapter<NewsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_berita, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = listNews.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val datanews = listNews[position]
        holder.setData(datanews, position)
        holder.itemView.setOnClickListener {
            View.OnClickListener {
                this.onItemClickCallback.onItemClick(listNews[position])
            }
        }
    }

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        private var currentNews: News? = null
        private var currrentPosition: Int = 0

        fun setData(currnews: News, pos: Int) {
            itemView.tvw_Title.text = currnews.title
            itemView.tvw_Desc.text = currnews.desc
            itemView.img_news.setImageResource(currnews.photo)

            this.currentNews = currnews
            this.currrentPosition = pos
        }
    }

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClick(data: News)
    }

}