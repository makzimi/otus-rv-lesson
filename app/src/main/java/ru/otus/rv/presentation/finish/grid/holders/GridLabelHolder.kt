package ru.otus.rv.presentation.finish.grid.holders

import androidx.recyclerview.widget.RecyclerView
import ru.otus.rv.databinding.GridLabelItemBinding
import ru.otus.rv.presentation.finish.grid.GridItem

class GridLabelHolder(private val binding: GridLabelItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(label: GridItem.Label) {
        binding.label.text = label.label
    }
}
