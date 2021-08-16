package com.example.codelab3_trivia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.codelab3_trivia.databinding.FragmentThirdBinding


class ThirdFragment : Fragment() {

    private var _binding: FragmentThirdBinding? = null
    private val binding get() = _binding!!

    //* onCreateView() is the Fragment equivalent of onCreate() for Activities and runs during the View creation.
    //* onViewCreated() runs after the View has been created.

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentThirdBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvThirdFragment1.setText("Hello ThirdFragment (This is from ThirdFragment)")
    }

}