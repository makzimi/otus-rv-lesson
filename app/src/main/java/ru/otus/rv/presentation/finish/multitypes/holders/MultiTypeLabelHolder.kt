package ru.otus.rv.presentation.finish.multitypes.holders

import androidx.recyclerview.widget.RecyclerView
import ru.otus.rv.databinding.MultiTypeLabelItemBinding
import ru.otus.rv.presentation.finish.multitypes.MultiTypeItem

class MultiTypeLabelHolder(private val binding: MultiTypeLabelItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(label: MultiTypeItem.Label) {
        binding.label.text = label.label
    }
}
