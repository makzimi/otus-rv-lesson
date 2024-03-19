package ru.otus.rv.presentation.start.multitypes

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import ru.otus.rv.databinding.MultiTypeBigItemBinding
import ru.otus.rv.databinding.MultiTypeLabelItemBinding
import ru.otus.rv.databinding.MultiTypeSmallItemBinding
import ru.otus.rv.presentation.start.multitypes.holders.MultiTypeBigHolder
import ru.otus.rv.presentation.start.multitypes.holders.MultiTypeLabelHolder
import ru.otus.rv.presentation.start.multitypes.holders.MultiTypeSmallHolder

class MultiTypeAdapter : Adapter<RecyclerView.ViewHolder>() {

    var items: List<MultiTypeItem> = emptyList()

    override fun getItemViewType(position: Int): Int {
        return when (items[position]) {
            is MultiTypeItem.Label -> MultiTypeItem.Label.TYPE
            is MultiTypeItem.SmallProduct -> MultiTypeItem.SmallProduct.TYPE
            is MultiTypeItem.BigProduct -> MultiTypeItem.BigProduct.TYPE
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            MultiTypeItem.Label.TYPE -> MultiTypeLabelHolder(
                MultiTypeLabelItemBinding.inflate(
                    LayoutInflater.from(parent.context), parent, false
                )
            )
            MultiTypeItem.SmallProduct.TYPE -> MultiTypeSmallHolder(
                MultiTypeSmallItemBinding.inflate(
                    LayoutInflater.from(parent.context), parent, false
                )
            )
            MultiTypeItem.BigProduct.TYPE -> MultiTypeBigHolder(
                MultiTypeBigItemBinding.inflate(
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
            is MultiTypeLabelHolder -> (items[position] as? MultiTypeItem.Label)?.let{ holder.bind(it) }
            is MultiTypeSmallHolder -> (items[position] as? MultiTypeItem.SmallProduct)?.let{ holder.bind(it) }
            is MultiTypeBigHolder -> (items[position] as? MultiTypeItem.BigProduct)?.let{ holder.bind(it) }
        }
    }
}
