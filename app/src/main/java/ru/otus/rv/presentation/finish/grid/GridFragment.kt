package ru.otus.rv.presentation.finish.grid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import ru.otus.rv.databinding.FragmentGridBinding

class GridFragment : Fragment() {

    private var _binding: FragmentGridBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGridBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = GridAdapter()
        binding.recyclerView.adapter = adapter

        val manager = GridLayoutManager(
            /* context = */ requireContext(),
            /* spanCount = */ 2,
        )
        manager.spanSizeLookup = DoubleGridSpanSizeLookup(adapter)

        binding.recyclerView.layoutManager = manager

        adapter.items = GridFactory.create()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
