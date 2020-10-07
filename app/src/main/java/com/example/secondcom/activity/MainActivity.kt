package com.example.secondcom.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.secondcom.R
import com.example.secondcom.adapter.NewsAdapter
import com.example.secondcom.model.NewsModel

class MainActivity : AppCompatActivity() {

    private lateinit var newsAdapter: NewsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var headlineNews: news?
        if (NewsModel.newsList.isNotEmpty()) {
            headlineNews = NewsModel.newsList[NewsModel.newsList.size-1]
            /*Some widget
            * Some widget
            * Some widget*/

            /*Some widget
            *val intentDetail = Intent(this@MainActivity, DetailActivity::class.java).apply {
                putExtra(DetailActivity.contTitleNews, headlineNews.title.toString)
                putExtra(DetailActivity.contPhotoNews, headlineNews.photo.toString)
            }
            startActivity(intentDetail)
            finish()*/
        }

        val layManager = LinearLayoutManager(this)
        layManager.orientation = LinearLayoutManager.VERTICAL
        /*Some widget*/

        newsAdapter = NewsAdapter(this, NewsModel.newsList)
        /*Some widget*/
    }
}