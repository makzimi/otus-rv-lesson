package ru.otus.rv

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import ru.otus.rv.databinding.FragmentSelectBinding

class SelectFragment: Fragment() {

    private var _binding: FragmentSelectBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSelectBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.startSimple.setOnClickListener {
            findNavController().navigate(R.id.action_selectFragment_to_StartSimpleFragment)
        }

        binding.startMultitype.setOnClickListener {
            findNavController().navigate(R.id.action_selectFragment_to_StartMultiTypeFragment)
        }

        binding.startGrid.setOnClickListener {
            findNavController().navigate(R.id.action_selectFragment_to_StartGridFragment)
        }

        binding.startListAdapter.setOnClickListener {
            findNavController().navigate(R.id.action_selectFragment_to_StartDUListFragment)
        }

        binding.finishSimple.setOnClickListener {
            findNavController().navigate(R.id.action_selectFragment_to_FinishSimpleFragment)
        }

        binding.finishMultitype.setOnClickListener {
            findNavController().navigate(R.id.action_selectFragment_to_FinishMultiTypeFragment)
        }

        binding.finishGrid.setOnClickListener {
            findNavController().navigate(R.id.action_selectFragment_to_FinishGridFragment)
        }

        binding.finishListAdapter.setOnClickListener {
            findNavController().navigate(R.id.action_selectFragment_to_FinishDUListFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
