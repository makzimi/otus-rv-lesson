package ru.otus.rv.presentation.start.grid.holders

import androidx.recyclerview.widget.RecyclerView
import ru.otus.rv.databinding.GridBigItemBinding
import ru.otus.rv.presentation.start.grid.GridItem

class GridBigHolder(private val binding: GridBigItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(bigProduct: GridItem.BigProduct) {
        binding.image.setImageResource(bigProduct.product.resId)
        binding.title.text = bigProduct.product.title
        binding.description.text = bigProduct.product.description
        binding.price.text = "${bigProduct.product.price} $"
    }
}
