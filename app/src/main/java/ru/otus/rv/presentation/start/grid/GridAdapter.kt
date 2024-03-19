package ru.otus.rv.presentation.start.grid

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import ru.otus.rv.databinding.GridBigItemBinding
import ru.otus.rv.databinding.GridLabelItemBinding
import ru.otus.rv.databinding.GridSmallItemBinding
import ru.otus.rv.presentation.start.grid.holders.GridBigHolder
import ru.otus.rv.presentation.start.grid.holders.GridLabelHolder
import ru.otus.rv.presentation.start.grid.holders.GridSmallHolder

class GridAdapter : Adapter<RecyclerView.ViewHolder>() {

    var items: List<GridItem> = emptyList()

    override fun getItemViewType(position: Int): Int {
        return when (items[position]) {
            is GridItem.Label -> GridItem.Label.TYPE
            is GridItem.SmallProduct -> GridItem.SmallProduct.TYPE
            is GridItem.BigProduct -> GridItem.BigProduct.TYPE
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            GridItem.Label.TYPE -> GridLabelHolder(
                GridLabelItemBinding.inflate(
                    LayoutInflater.from(parent.context), parent, false
                )
            )
            GridItem.SmallProduct.TYPE -> GridSmallHolder(
                GridSmallItemBinding.inflate(
                    LayoutInflater.from(parent.context), parent, false
                )
            )
            GridItem.BigProduct.TYPE -> GridBigHolder(
                GridBigItemBinding.inflate(
                    LayoutInflater.from(parent.context), parent, false
                )
            )
            else -> throw IllegalStateException("Unknown type")
        }

    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is GridLabelHolder -> (items[position] as? GridItem.Label)?.let{ holder.bind(it) }
            is GridSmallHolder -> (items[position] as? GridItem.SmallProduct)?.let{ holder.bind(it) }
            is GridBigHolder -> (items[position] as? GridItem.BigProduct)?.let{ holder.bind(it) }
        }
    }
}
