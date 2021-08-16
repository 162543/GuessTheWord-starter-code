package com.example.codelab3_trivia

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.codelab3_trivia.databinding.FragmentFirstBinding

class FirstFragment: Fragment() {
    private val TAG = "FirstFragment"

    //* This property is only valid between onCreateView and onDestroyView.
    private var _binding: FragmentFirstBinding? = null
    //* เพราะว่า _binding is nullable , แต่เราไม่ต้องการที่จะต้องจัดการกับ nullable ทุกๆทีึ่ในหน้า code นี้ เราจึงทำการ overriding ตัว getter() ของ binding
    private val binding get() = _binding!!


    //* onCreateView() is the Fragment equivalent of onCreate() for Activities and runs during the View creation.
    //* onViewCreated() runs after the View has been created.
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i(TAG, "onCreateView called")
        //* เรา inflate (fragment view มี parent view อยู่ใน activity_main.xml layout)
        _binding = FragmentFirstBinding.inflate(inflater,container,false)

        binding.tvFragmentText1.text = "This is 1stFragmentText1 (create from FirstFragment.kt)"
        binding.tvFragmentText2.text = "This is 1stFragmentText2 (create from FirstFragment.kt)"
        return binding.root

    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i(TAG, "onAttach called")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "onCreate called")
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i(TAG, "onViewCreated called")
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
        _binding = null   //* เราจะ set ตัวแปร '_binding' เป็น null เมื่อมีการ call 'onDestroy'
        Log.i(TAG, "onDestroyView called")
    }
    override fun onDetach() {
        super.onDetach()
        Log.i(TAG, "onDetach called")
    }

}