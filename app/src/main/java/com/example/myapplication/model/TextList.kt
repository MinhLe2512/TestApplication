package com.example.myapplication.model

class TextList {
    private var textList = ArrayList<String>()
    fun addText() {
        textList.add("1")
        textList.add("2")
        textList.add("3")
        textList.add("4")
        textList.add("5")
    }

    fun getList(position:Int): String {
        return textList[position]
    }

    fun getSize(): Int {
        return textList.size
    }
}