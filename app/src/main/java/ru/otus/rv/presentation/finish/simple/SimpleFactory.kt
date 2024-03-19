package ru.otus.rv.presentation.finish.simple

import ru.otus.rv.data.ProductsRepository

object SimpleFactory {
    fun create(): List<SimpleItem> {
        return buildList {
            addAll(
                ProductsRepository().getProducts().map { product ->
                    SimpleItem(product = product)
                }
            )
        }
    }
}