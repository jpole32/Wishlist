package com.example.wishlist

class WishlistFetcher {
    companion object {
        val items = listOf("Some Item")
        val prices = listOf("1.99")
        val urls = listOf("www.idk.com")
        fun getWishes(): MutableList<Wishlist> {
            var wishes : MutableList<Wishlist> = ArrayList()
            for (i in 0..9) {
                val wishitem = Wishlist(items[i], prices[i], urls[i])
                wishes.add(wishitem)
            }
            return wishes
        }

        fun getNext5Wishes(): MutableList<Wishlist> {
            var newWishes : MutableList<Wishlist> = ArrayList()
            for (i in 10..14) {
                val wish = Wishlist(items[i], prices[i], urls[i])
                newWishes.add(wish)
            }
            return newWishes
        }
    }
}