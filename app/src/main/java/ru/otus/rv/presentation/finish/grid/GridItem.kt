package ru.otus.rv.presentation.finish.grid

import ru.otus.rv.R
import ru.otus.rv.data.Product

sealed interface GridItem {
    data class Label(val label: String): GridItem {
        companion object {
            val TYPE: Int = R.layout.grid_label_item
        }
    }

    data class SmallProduct(val product: Product): GridItem {
        companion object {
            val TYPE: Int = R.layout.grid_small_item
        }
    }

    data class BigProduct(val product: Product): GridItem {
        companion object {
            val TYPE: Int = R.layout.grid_big_item
        }
    }
}
