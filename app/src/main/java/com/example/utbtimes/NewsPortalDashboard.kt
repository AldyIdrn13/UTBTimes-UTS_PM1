package com.example.utbtimes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class NewsPortalDashboard : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: NewsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.news_portal_dasboard)

        val newsList = listOf(
            NewsItem("Kotlin is Awesome!", R.drawable.utbtlogo1, "10 Mei 2025, 09:00"),
            NewsItem("AI in Mobile Dev", R.drawable.utbtlogo1, "10 Mei 2025, 10:00"),
            NewsItem("Cybersecurity Tips", R.drawable.utbtlogo1, "10 Mei 2025, 11:15"),
            NewsItem("Kotlin is Awesome!", R.drawable.utbtlogo1, "10 Mei 2025, 09:00"),
            NewsItem("AI in Mobile Dev", R.drawable.utbtlogo1, "10 Mei 2025, 10:00"),
            NewsItem("Cybersecurity Tips", R.drawable.utbtlogo1, "10 Mei 2025, 11:15")
        )

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = NewsAdapter(newsList)
        recyclerView.adapter = adapter
    }
}
