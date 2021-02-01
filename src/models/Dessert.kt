package com.example.models

data class Dessert(val id: String, val userId: String, var name: String, var description: String, var imageUrl: String)

data class DessertInput(val name: String, val description: String, val imageUrl: String)

data class PagingInfo(var count: Int, var pages: Int, var next: Int?, var prev: Int?)

data class DessertsPage(val results: List<Dessert>, val info: PagingInfo)