package ru.otus.rv.presentation.start.simple

import androidx.recyclerview.widget.RecyclerView
import ru.otus.rv.databinding.SimpleItemBinding

class SimpleHolder(val binding: SimpleItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(simpleItem: SimpleItem) {
        binding.image.setImageResource(simpleItem.product.resId)
        binding.title.text = simpleItem.product.title
        binding.description.text = simpleItem.product.description
        binding.price.text = "${simpleItem.product.price} $"
    }
}
