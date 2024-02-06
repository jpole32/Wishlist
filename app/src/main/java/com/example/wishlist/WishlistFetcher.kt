package com.example.wishlist

import android.util.Log

class WishlistFetcher {
    companion object {
        val items = mutableListOf<String>()
        val prices = mutableListOf<String>()
        val urls = mutableListOf<String>()
        fun getWishes(): MutableList<Wishlist> {
            var wishes: MutableList<Wishlist> = ArrayList()
            /*var listLimit = items.size
            Log.d("Wishlist", "inside wishes, current length of list is "+listLimit.toString())
            if (listLimit > 0){
                for (i in 0..(listLimit-1)) {
                    val wishitem = Wishlist(items[i], prices[i], urls[i])
                    Log.d("WishITem", items[i]+prices[i]+urls[i])
                    wishes.add(wishitem)
                }
            }*/
            return wishes
        }
        fun addItem(iName: String, iPrice: String, iLink: String): MutableList<Wishlist> {
            var newWish : MutableList<Wishlist> = ArrayList()
            val wish = Wishlist(iName, iPrice, iLink)
            Log.d("Wishlist", "items added to wishlist, calling getwishes")
            newWish.add(wish)
            return newWish

        }

    }



}