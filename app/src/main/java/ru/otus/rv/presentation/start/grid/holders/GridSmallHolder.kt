package ru.otus.rv.presentation.start.grid.holders

import androidx.recyclerview.widget.RecyclerView
import ru.otus.rv.databinding.GridSmallItemBinding
import ru.otus.rv.presentation.start.grid.GridItem

class GridSmallHolder(private val binding: GridSmallItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(smallProduct: GridItem.SmallProduct) {
        binding.image.setImageResource(smallProduct.product.resId)
        binding.title.text = smallProduct.product.title
        binding.description.text = smallProduct.product.description
        binding.price.text = "${smallProduct.product.price} $"
    }
}
