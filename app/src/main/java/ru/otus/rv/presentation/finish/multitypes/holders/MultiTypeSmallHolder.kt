package ru.otus.rv.presentation.finish.multitypes.holders

import androidx.recyclerview.widget.RecyclerView
import ru.otus.rv.databinding.MultiTypeSmallItemBinding
import ru.otus.rv.presentation.finish.multitypes.MultiTypeItem

class MultiTypeSmallHolder(private val binding: MultiTypeSmallItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(smallProduct: MultiTypeItem.SmallProduct) {
        binding.image.setImageResource(smallProduct.product.resId)
        binding.title.text = smallProduct.product.title
        binding.description.text = smallProduct.product.description
        binding.price.text = "${smallProduct.product.price} $"
    }
}
