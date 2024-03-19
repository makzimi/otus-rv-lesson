package ru.otus.rv.presentation.finish.simple

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.LinearLayoutManager
import ru.otus.rv.databinding.FragmentSimpleBinding


class SimpleFragment : Fragment() {

    private var _binding: FragmentSimpleBinding? = null
    private val binding get() = _binding!!

    lateinit var adapter: SimpleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSimpleBinding.inflate(layoutInflater)
        return binding.root
    }

    class DiffCallback(
        private val oldList: List<SimpleItem>,
        private val newList: List<SimpleItem>,
    ) : DiffUtil.Callback() {
        override fun getOldListSize(): Int = oldList.size

        override fun getNewListSize(): Int = newList.size

        override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
            return oldList[oldItemPosition].product.id == newList[newItemPosition].product.id
        }

        override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
            return oldList[oldItemPosition].product == newList[newItemPosition].product
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Try for CustomItemAnimator
//        adapter = SimpleAdapter { simpleItem, position ->
//            val newList = adapter.items.toMutableList().apply {
//                add(position, simpleItem)
//            }
//            adapter.submitList(newList)
//            adapter.notifyItemInserted(position)
//        }

        // Try for Diff Util
        adapter = SimpleAdapter { simpleItem, position ->
            val newList = adapter.items.toMutableList().apply {
                add(position - 1, simpleItem)
                add(position, simpleItem)
                add(position + 2, simpleItem)
            }

            val callback = DiffCallback(adapter.items,newList)
            val result = DiffUtil.calculateDiff(callback)

            adapter.submitList(newList)

            result.dispatchUpdatesTo(adapter)
        }

        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())

        // Try this
        //binding.recyclerView.recycledViewPool.setMaxRecycledViews(0, 2)

        // Try this
        //binding.recyclerView.setItemViewCacheSize(10)

        // Try this
        //binding.recyclerView.addItemDecoration(PaddingDecorator(20.dp))
        //binding.recyclerView.addItemDecoration(SeparatorDecorator(20.dp))

        // Try this
        //val callback = CustomItemTouchHelperCallback(adapter)
        //val itemTouchHelper = ItemTouchHelper(callback)
        //itemTouchHelper.attachToRecyclerView(binding.recyclerView)

        // Try this
        binding.recyclerView.itemAnimator = CustomItemAnimator(requireContext())

        adapter.submitList(SimpleFactory.create())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
