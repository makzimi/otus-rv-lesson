package ru.otus.rv.presentation.start.grid

import ru.otus.rv.data.FoodType
import ru.otus.rv.data.ProductsRepository

object GridFactory {
    fun create(): List<GridItem> {
        val allProducts = ProductsRepository().getProducts()
        return buildList {
            add(GridItem.Label(label = "New products"))

            addAll(
                allProducts.take(1).map {
                    GridItem.BigProduct(product = it)
                }
            )

            addAll(
                allProducts.take(5).drop(1).map {
                    GridItem.SmallProduct(product = it)
                }
            )

            add(GridItem.Label(label = "Special prices"))

            addAll(
                allProducts.filter {
                    it.price < 5.0
                }.take(4).map {
                    GridItem.SmallProduct(product = it)
                }
            )

            add(GridItem.Label(label = "Try it!"))

            add(GridItem.BigProduct(product = allProducts.first { it.price > 10.0 }))

            add(GridItem.Label(label = "Main menu"))

            addAll(
                allProducts.filter {
                    it.foodType == FoodType.Food
                }
                    .take(1)
                    .map {
                        GridItem.BigProduct(product = it)
                    }
            )

            addAll(
                allProducts.filter {
                    it.foodType == FoodType.Food
                }
                    .drop(1)
                    .map {
                        GridItem.SmallProduct(product = it)
                    }
            )

            add(GridItem.Label(label = "Drinks"))

            addAll(
                allProducts.filter {
                    it.foodType == FoodType.Drinks
                }
                    .take(1)
                    .map {
                        GridItem.BigProduct(product = it)
                }
            )

            addAll(
                allProducts.filter {
                    it.foodType == FoodType.Drinks
                }
                    .drop(1)
                    .map {
                        GridItem.SmallProduct(product = it)
                    }
            )

            add(GridItem.Label(label = "Desserts"))

            addAll(
                allProducts.filter {
                    it.foodType == FoodType.Dessert
                }
                    .take(1)
                    .map {
                        GridItem.BigProduct(product = it)
                    }
            )

            addAll(
                allProducts.filter {
                    it.foodType == FoodType.Dessert
                }
                    .drop(1)
                    .map {
                        GridItem.SmallProduct(product = it)
                    }
            )
        }
    }
}