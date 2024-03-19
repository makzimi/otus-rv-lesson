package ru.otus.rv.presentation.finish.dulist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import ru.otus.rv.databinding.DuListItemBinding

class DUListAdapter(
    private val onItemClicked: (DUListItem, Int) -> Unit,
) : ListAdapter<DUListItem, DUListHolder>(DiffCallBack()) {

    class DiffCallBack : DiffUtil.ItemCallback<DUListItem>() {
        override fun areItemsTheSame(oldItem: DUListItem, newItem: DUListItem): Boolean {
            return oldItem.product.id == newItem.product.id
        }

        override fun areContentsTheSame(oldItem: DUListItem, newItem: DUListItem): Boolean {
            return oldItem.product == newItem.product
        }

        override fun getChangePayload(oldItem: DUListItem, newItem: DUListItem): Any? {
            return super.getChangePayload(oldItem, newItem)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DUListHolder {
        return DUListHolder(
            DuListItemBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: DUListHolder, position: Int) {
        val item = currentList[position]
        holder.bind(item)

        holder.itemView.setOnClickListener {
            onItemClicked(item, position)
        }
    }

    override fun onBindViewHolder(holder: DUListHolder, position: Int, payloads: MutableList<Any>) {
        super.onBindViewHolder(holder, position, payloads)
    }
}
