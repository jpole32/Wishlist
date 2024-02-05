package com.example.wishlist

class WishlistFetcher {
    companion object {
        val items = listOf("Some Item","Second item")
        val prices = listOf("1.99","2.00")
        val urls = listOf("www.idk.com","somesite.com")
        fun getWishes(): MutableList<Wishlist> {
            var wishes: MutableList<Wishlist> = ArrayList()
            var listLimit = items.size
            if (listLimit > 0){
                for (i in 0..(listLimit-1)) {
                    val wishitem = Wishlist(items[i], prices[i], urls[i])
                    wishes.add(wishitem)
                }
            }
            return wishes
        }

    }
}