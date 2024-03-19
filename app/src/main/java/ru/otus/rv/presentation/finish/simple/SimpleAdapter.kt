package ru.otus.rv.presentation.finish.simple

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import ru.otus.rv.databinding.SimpleItemBinding
import java.util.Collections

class SimpleAdapter(
    private val onItemClicked: (SimpleItem, Int) -> Unit
) : Adapter<SimpleHolder>(), CustomItemTouchHelperListener {

    private val _items: MutableList<SimpleItem> = mutableListOf()
    val items: List<SimpleItem> = _items

    fun submitList(items: List<SimpleItem>) {
        this._items.clear()
        this._items.addAll(items)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleHolder {
        println("RV: onCreateViewHolder")
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

        holder.binding.root.setOnClickListener {
            onItemClicked(item, position)
        }
    }

    override fun onViewRecycled(holder: SimpleHolder) {
        super.onViewRecycled(holder)
        println("RV: onViewRecycled [${holder.binding.title.text}]")
    }

    override fun onFailedToRecycleView(holder: SimpleHolder): Boolean {
        println("RV: onFailedToRecycleView [${holder.binding.title.text}]")
        return true
    }

    override fun onItemMove(fromPosition: Int, toPosition: Int): Boolean {
        Collections.swap(_items, fromPosition, toPosition)
        notifyItemMoved(fromPosition, toPosition)
        return true
    }

    override fun onItemDismiss(position: Int) {
        _items.removeAt(position)
        notifyItemRemoved(position)
    }
}
