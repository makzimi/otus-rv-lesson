package ru.otus.rv.presentation.start.dulist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import ru.otus.rv.databinding.FragmentDuListBinding

class DUListFragment : Fragment() {

    private var _binding: FragmentDuListBinding? = null
    private val binding get() = _binding!!

    lateinit var adapter:DUListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDuListBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = DUListAdapter()

        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())

        adapter.submitList(DUListFactory.create())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
