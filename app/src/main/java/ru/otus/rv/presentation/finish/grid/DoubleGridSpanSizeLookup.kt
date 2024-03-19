package ru.otus.rv.presentation.finish.grid

import androidx.recyclerview.widget.GridLayoutManager

class DoubleGridSpanSizeLookup(
    private val adapter: GridAdapter,
) : GridLayoutManager.SpanSizeLookup() {
    override fun getSpanSize(position: Int): Int {
        val type = adapter.getItemViewType(position)
        return when (type) {
            GridItem.Label.TYPE -> 2
            GridItem.SmallProduct.TYPE -> 1
            GridItem.BigProduct.TYPE -> 2
            else -> 1
        }
    }
}