package ru.otus.rv.presentation.start.grid.holders

import androidx.recyclerview.widget.RecyclerView
import ru.otus.rv.databinding.GridLabelItemBinding
import ru.otus.rv.presentation.start.grid.GridItem

class GridLabelHolder(private val binding: GridLabelItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(label: GridItem.Label) {
        binding.label.text = label.label
    }
}
