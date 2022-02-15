package com.example.you_tube

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerFeed: RecyclerView
    lateinit var recyclerFilter: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        recyclerFilter = findViewById(R.id.recyclerFilter)
        recyclerFeed = findViewById(R.id.recyclerFeed)
        recyclerFilter.setLayoutManager(LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false))
        recyclerFeed.setLayoutManager(GridLayoutManager(this,1))

        refreshFeedAdapter(getAllFeeds())
        refreshFilterAdapter(getAllFilters())
    }

    private fun getAllFilters(): ArrayList<Filter> {
        val filters : ArrayList<Filter> = ArrayList()

        filters.add(Filter("Computer Programming"))
        filters.add(Filter("Android Native"))
        filters.add(Filter("Mobile Development"))
        filters.add(Filter("Mobile Development"))
        filters.add(Filter("Mobile Development"))
        filters.add(Filter("Mobile Development"))
        filters.add(Filter("Mobile Development"))
        filters.add(Filter("Mobile Development"))
        filters.add(Filter("Mobile Development"))

        return filters
    }

    private fun getAllFeeds(): ArrayList<Feed> {
        val feeds:ArrayList<Feed> = ArrayList()

        feeds.add(Feed(R.drawable.ic_launcher_background,R.drawable.img))
        feeds.add(Feed(R.drawable.ic_launcher_background,R.drawable.img))
        feeds.add(Feed(R.drawable.ic_launcher_background,R.drawable.img))
        feeds.add(Feed(R.drawable.ic_launcher_background,R.drawable.img))
        feeds.add(Feed(R.drawable.ic_launcher_background,R.drawable.img))
        feeds.add(Feed(R.drawable.ic_launcher_background,R.drawable.img))
        feeds.add(Feed(R.drawable.ic_launcher_background,R.drawable.img))
        feeds.add(Feed(R.drawable.ic_launcher_background,R.drawable.img))
        feeds.add(Feed(R.drawable.ic_launcher_background,R.drawable.img))
        feeds.add(Feed(R.drawable.ic_launcher_background,R.drawable.img))
        feeds.add(Feed(R.drawable.ic_launcher_background,R.drawable.img))
        feeds.add(Feed(R.drawable.ic_launcher_background,R.drawable.img))

        return feeds
    }

    private fun refreshFilterAdapter(filters: ArrayList<Filter>) {
        val adapter = FilterAdapter(this, filters)
        recyclerFilter.adapter = adapter
    }

    private fun refreshFeedAdapter(feeds:ArrayList<Feed>) {
        val adapter = FeedAdapter(this, feeds)
        recyclerFeed.adapter = adapter
    }


}