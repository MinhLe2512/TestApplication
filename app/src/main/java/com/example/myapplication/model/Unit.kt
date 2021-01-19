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

    companion object {
        val listImage = listOf(
            R.drawable.scr_shot1,
            R.drawable.scr_shot2,
            R.drawable.scr_shot3,
            R.drawable.scr_shot4,
            R.drawable.scr_shot5
        )

        //var listProduct: ArrayList<Product> = ArrayList()

        val listUnit =
            listOf(
                Unit(
                    1,
                    "Unit 1",
                    Product.listProduct
                ),
                Unit(
                    2,
                    "Unit 2",
                    Product.listProduct
                ),
                Unit(
                    3,
                    "Unit 3",
                    Product.listProduct
                ),
                Unit(
                    4,
                    "Unit 4",
                    Product.listProduct
                ),
                Unit(
                    5,
                    "Unit 5",
                    Product.listProduct
                )
            )


        /*fun getListOfProduct(position: Int): List<Product> {
            return listUnit[position].listOfProduct
        }*/
    }
}