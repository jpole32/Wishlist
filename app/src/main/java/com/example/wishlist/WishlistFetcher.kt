package com.example.wishlist

class WishlistFetcher {
    companion object {
        val items = listOf("Dahlia Cline", "Kevin Miranda", "Kaya Austin", "Laila Calderon", "Marquise Rhodes", "Fletcher Patel", "Luz Barron", "Kamren Dudley", "Jairo Foster", "Lilah Sandoval", "Ansley Blake", "Slade Sawyer", "Jaelyn Holmes", "Phoenix Bright", "Ernesto Gould")
        val prices = "Welcome to Kotlin!"
        val urls = "Welcome to the Android Kotlin Course! We're excited to have you join us and learn how to develop Android apps using Kotlin. Here are some tips to get started."
        fun getEmails(): MutableList<Wishlist> {
            var wishes : MutableList<Wishlist> = ArrayList()
            for (i in 0..9) {
                val wishitem = Wishlist(items[i], prices, urls)
                wishes.add(wishitem)
            }
            return wishes
        }

        fun getNext5Emails(): MutableList<Wishlist> {
            var newWishes : MutableList<Wishlist> = ArrayList()
            for (i in 10..14) {
                val wish = Wishlist(items[i], prices, urls)
                newWishes.add(wish)
            }
            return newWishes
        }
    }
}