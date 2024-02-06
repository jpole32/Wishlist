package com.example.wishlist

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    @SuppressLint("NotifyDataSetChanged")
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var wishes: List<Wishlist>
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Lookup the RecyclerView in activity layout
        val wishRv = findViewById<RecyclerView>(R.id.wishlistRv)
        val button = findViewById<Button>(R.id.addTo)
        val itemToAdd = findViewById<EditText>(R.id.itemTitle)
        val priceToAdd = findViewById<EditText>(R.id.itemPrice)
        val linkToAdd = findViewById<EditText>(R.id.itemLink)
        var textTitle = ""
        var textPrice = ""
        var textLink = ""
        // Fetch the list of emails
        wishes = WishlistFetcher.getWishes()
        // Create adapter passing in the list of emails
        val adapter = WishlistAdapter(wishes)
        // Attach the adapter to the RecyclerView to populate items
        wishRv.adapter = adapter
        // Set layout manager to position the items
        wishRv.layoutManager = LinearLayoutManager(this)
        button.setOnClickListener{
            textTitle = itemToAdd.text.toString()
            textPrice = priceToAdd.text.toString()
            textLink = linkToAdd.text.toString()
            val nWishes = WishlistFetcher.addItem(textTitle,textPrice,textLink)
            wishes.addAll(nWishes)
            // Attach the adapter to the RecyclerView to populate items
            adapter.notifyDataSetChanged()
        }
    }
}