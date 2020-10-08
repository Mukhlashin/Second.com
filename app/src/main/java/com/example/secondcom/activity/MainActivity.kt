package com.example.secondcom.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.secondcom.R
import com.example.secondcom.adapter.NewsAdapter
import com.example.secondcom.model.News
import com.example.secondcom.model.NewsModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var newsAdapter: NewsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val headlineNews: News?
        if (NewsModel.newsList.isNotEmpty()) {
            headlineNews = NewsModel.newsList[NewsModel.newsList.size-1]
            tvw_TitleHeadline.text = headlineNews.title
            tvw_DescHeadline.text = headlineNews.desc
            img_news0.setImageResource(headlineNews.photo)

            cdv_newsheadline.setOnClickListener{
                val intentDetail = Intent(this@MainActivity,
                    DetailActivity::class.java).apply {
                    putExtra(DetailActivity.cont_TitleNews,
                        headlineNews.title)
                    putExtra(DetailActivity.cont_PhotoNews,
                        headlineNews.photo.toString())

                }
                startActivity(intentDetail)
                finish()
            }
        }

        val layManager = LinearLayoutManager(this)
        layManager.orientation = LinearLayoutManager.VERTICAL
        rcv_daftarberita.layoutManager = layManager

        newsAdapter = NewsAdapter(this, NewsModel.newsList)
        rcv_daftarberita.adapter = newsAdapter

        newsAdapter.setOnItemClickCallback(
            object : NewsAdapter.OnItemClickCallback {
                override fun onItemClick(data: News) {
                    val intent = Intent(this@MainActivity,
                        DetailActivity::class.java).apply {
                        putExtra(DetailActivity.cont_TitleNews,
                            data.title.toString())
                        putExtra(DetailActivity.cont_PhotoNews,
                            data.photo.toString())
                    }
                    startActivity(intent)
                    finish()
                }
            })
    }
}