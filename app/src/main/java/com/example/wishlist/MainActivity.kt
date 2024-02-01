package com.example.wishlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var wishes: List<Wishlist>
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Lookup the RecyclerView in activity layout
        val wishRv = findViewById<RecyclerView>(R.id.wishlistRv)
        // Fetch the list of emails
        wishes = WishlistFetcher.getWishes()
        // Create adapter passing in the list of emails
        val adapter = WishlistAdapter(wishes)
        // Attach the adapter to the RecyclerView to populate items
        wishRv.adapter = adapter
        // Set layout manager to position the items
        wishRv.layoutManager = LinearLayoutManager(this)
    }
}