package ru.otus.rv.presentation.start.dulist

import ru.otus.rv.data.ProductsRepository

object DUListFactory {
    fun create(): List<DUListItem> {
        return buildList {
            addAll(
                ProductsRepository().getProducts().map { product ->
                    DUListItem(product = product)
                }
            )
        }
    }
}