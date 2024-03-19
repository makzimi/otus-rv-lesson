package ru.otus.rv.presentation.start.multitypes.holders

import androidx.recyclerview.widget.RecyclerView
import ru.otus.rv.databinding.MultiTypeBigItemBinding
import ru.otus.rv.presentation.start.multitypes.MultiTypeItem

class MultiTypeBigHolder(private val binding: MultiTypeBigItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(bigProduct: MultiTypeItem.BigProduct) {
        binding.image.setImageResource(bigProduct.product.resId)
        binding.title.text = bigProduct.product.title
        binding.description.text = bigProduct.product.description
        binding.price.text = "${bigProduct.product.price} $"
    }
}
