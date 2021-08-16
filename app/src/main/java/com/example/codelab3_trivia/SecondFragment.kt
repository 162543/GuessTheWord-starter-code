package com.example.codelab3_trivia

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.codelab3_trivia.databinding.FragmentSecondBinding


class SecondFragment : Fragment(R.layout.fragment_second) {

    private val TAG = "SecondFragment"

    private lateinit var binding: FragmentSecondBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i(TAG, "onViewCreated called")
        binding = FragmentSecondBinding.bind(view)
        binding.tvSecondFragment1.text = "Hello SecondFragment (This is from SecondFragment.kt)"
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i(TAG, "onAttach called")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "onCreate called")
    }
    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart called")
    }
    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume called")
    }
    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause called")
    }
    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop called")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        Log.i(TAG, "onDestroyView called")
    }
    override fun onDetach() {
        super.onDetach()
        Log.i(TAG, "onDetach called")
    }

}
