package ru.otus.rv.presentation.start.dulist

import androidx.recyclerview.widget.RecyclerView
import ru.otus.rv.databinding.DuListItemBinding

class DUListHolder(val binding: DuListItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(duListItem: DUListItem) {
        binding.image.setImageResource(duListItem.product.resId)
        binding.title.text = duListItem.product.title
        binding.description.text = duListItem.product.description
        binding.price.text = "${duListItem.product.price} $"
    }
}
