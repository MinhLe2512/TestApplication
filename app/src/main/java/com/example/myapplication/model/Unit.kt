package com.example.myapplication.model

import com.example.myapplication.R

class Unit(
    val id: Int = 0,
    val address: String? = null,
    var listOfProduct: List<Product>
) {
    class Product(
        val id: Int = 0,
        val productName: String? = null,
        val productPrice: Int = 0
    ) {
        companion object {
            val listProduct = listOf(
                Product(1, "Package 1", 50000),
                Product(2, "Package 2", 50000),
                Product(3, "Package 3", 100000),
                Product(1, "Book 1", 50000),
                Product(2, "Book 2", 60000),
                Product(3, "Book 3", 40000),
                Product(1, "Package 1", 50000),
                Product(2, "Package 2", 50000),
                Product(3, "Package 3", 100000),
                Product(1, "Book 1", 50000),
                Product(2, "Book 2", 60000),
                Product(3, "Book 3", 40000)
            )
        }
    }
}