package com.example.wishlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WishlistAdapter(private val items: List<Wishlist>) : RecyclerView.Adapter<WishlistAdapter.ViewHolder>(){
    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val iName: TextView
        val iPrice: TextView
        val iLink: TextView
        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each sub-view
        init {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            iName = itemView.findViewById(R.id.itemName)
            iPrice = itemView.findViewById(R.id.itemCost)
            iLink = itemView.findViewById(R.id.itemLink)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        // Inflate the custom layout
        val contactView = inflater.inflate(R.layout.wishlist_item, parent, false)
        // Return a new holder instance
        return ViewHolder(contactView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Get the data model based on position
        val wishItem = items.get(position)
        // Set item views based on views and data model
        holder.iName.text = wishItem.item
        holder.iPrice.text = wishItem.price
        holder.iLink.text = wishItem.url
    }

    override fun getItemCount(): Int {
        return items.size
    }
}