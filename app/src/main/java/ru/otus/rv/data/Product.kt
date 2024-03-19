package ru.otus.rv.data

import androidx.annotation.DrawableRes

data class Product(
    val id: String,
    @DrawableRes val resId: Int,
    val title: String,
    val description: String,
    val foodType: FoodType,
    val price: Double,
)

enum class FoodType {
    Food,
    Drinks,
    Dessert
}