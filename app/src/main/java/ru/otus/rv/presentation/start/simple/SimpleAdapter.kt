package ru.otus.rv.presentation.start.simple

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import ru.otus.rv.databinding.SimpleItemBinding

class SimpleAdapter : Adapter<SimpleHolder>() {

    private val _items: MutableList<SimpleItem> = mutableListOf()
    val items: List<SimpleItem> = _items

    fun submitList(items: List<SimpleItem>) {
        this._items.clear()
        this._items.addAll(items)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleHolder {
        return SimpleHolder(
            SimpleItemBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: SimpleHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }
}
