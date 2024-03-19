package ru.otus.rv.presentation.start.multitypes

import ru.otus.rv.data.FoodType
import ru.otus.rv.data.ProductsRepository

object MultiTypeFactory {
    fun create(): List<MultiTypeItem> {
        val allProducts = ProductsRepository().getProducts() 
        return buildList {
            add(MultiTypeItem.Label(label = "New products"))

            addAll(
                allProducts.take(1).map {
                    MultiTypeItem.BigProduct(product = it)
                }
            )

            addAll(
                allProducts.take(5).drop(1).map {
                    MultiTypeItem.SmallProduct(product = it)
                }
            )

            add(MultiTypeItem.Label(label = "Special prices"))

            addAll(
                allProducts.filter {
                    it.price < 5.0
                }.take(4).map {
                    MultiTypeItem.SmallProduct(product = it)
                }
            )

            add(MultiTypeItem.Label(label = "Try it!"))

            add(MultiTypeItem.BigProduct(product = allProducts.first { it.price > 10.0 }))

            add(MultiTypeItem.Label(label = "Main menu"))

            addAll(
                allProducts.filter {
                    it.foodType == FoodType.Food
                }
                    .take(1)
                    .map {
                        MultiTypeItem.BigProduct(product = it)
                    }
            )

            addAll(
                allProducts.filter {
                    it.foodType == FoodType.Food
                }
                    .drop(1)
                    .map {
                        MultiTypeItem.SmallProduct(product = it)
                    }
            )

            add(MultiTypeItem.Label(label = "Drinks"))

            addAll(
                allProducts.filter {
                    it.foodType == FoodType.Drinks
                }
                    .take(1)
                    .map {
                        MultiTypeItem.BigProduct(product = it)
                }
            )

            addAll(
                allProducts.filter {
                    it.foodType == FoodType.Drinks
                }
                    .drop(1)
                    .map {
                        MultiTypeItem.SmallProduct(product = it)
                    }
            )

            add(MultiTypeItem.Label(label = "Desserts"))

            addAll(
                allProducts.filter {
                    it.foodType == FoodType.Dessert
                }
                    .take(1)
                    .map {
                        MultiTypeItem.BigProduct(product = it)
                    }
            )

            addAll(
                allProducts.filter {
                    it.foodType == FoodType.Dessert
                }
                    .drop(1)
                    .map {
                        MultiTypeItem.SmallProduct(product = it)
                    }
            )
        }
    }
}