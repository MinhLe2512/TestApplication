package com.example.myapplication.model

class PhotoAccount(
    val Name: String,
    val Amount: Int,
    val Status: String,
    val AmountStr: String,
    val StatusStr: String,
    val BalanceHistory: List<History>,
    val Usage: List<UseService>
) {
    class History(
        val Strm: String,
        val Amount: Int,
        val AmountStr: String
    )

    class UseService(
        val Service: String,
        val Amount: Int,
        val AmountStr: String,
        val DateUsed: String
    )
}