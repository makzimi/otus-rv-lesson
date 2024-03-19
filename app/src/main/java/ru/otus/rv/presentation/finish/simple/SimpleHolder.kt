package ru.otus.rv.presentation.finish.simple

import androidx.recyclerview.widget.RecyclerView
import ru.otus.rv.databinding.SimpleItemBinding

class SimpleHolder(val binding: SimpleItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(simpleItem: SimpleItem) {
        binding.image.setImageResource(simpleItem.product.resId)
        binding.title.text = simpleItem.product.title
        binding.description.text = simpleItem.product.description
        binding.price.text = "${simpleItem.product.price} $"

        // Try this. This will put views in transient state
        //binding.image.setAlpha(0f)
        //binding.image.animate().setDuration(1000).alpha(1f).start()
    }
}
