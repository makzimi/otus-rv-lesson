package ru.otus.rv.presentation.start.multitypes

import ru.otus.rv.R
import ru.otus.rv.data.Product

sealed interface MultiTypeItem {
    data class Label(val label: String): MultiTypeItem {
        companion object {
            val TYPE: Int = R.layout.multi_type_label_item
        }
    }

    data class SmallProduct(val product: Product): MultiTypeItem {
        companion object {
            val TYPE: Int = R.layout.multi_type_small_item
        }
    }

    data class BigProduct(val product: Product): MultiTypeItem {
        companion object {
            val TYPE: Int = R.layout.multi_type_big_item
        }
    }
}
