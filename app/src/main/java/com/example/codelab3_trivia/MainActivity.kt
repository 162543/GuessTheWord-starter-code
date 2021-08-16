package com.example.codelab3_trivia

import android.graphics.Insets.add
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.replace
import android.util.Log
import android.widget.Toast
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.example.codelab3_trivia.databinding.ActivityMainBinding
import timber.log.Timber


class MainActivity : AppCompatActivity() {

    //private val TAG = "MainActivity : codelab3_trivia"

    //* สร้าง object ชื่อ binding ขึ้นมาจาก คลาสชื่อ 'ActivityMainBinding' (ซึ่งคลาสนี้จะถูกสร้างขึ้นมาให้เราแบบอัติโนมัติ โดยแปลงมาจาก xml ไฟล์ ที่ชื่อ activity_main.xml)
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)   //* แล้วทำการ inflate
        setContentView(binding.root)                            //* จากนั้น ให้เรา setContentView ให้เป็น binding.root

        //Log.i(TAG, "onCreate: is called.")
        Timber.i("onCreate called")     //* ใช้ Timber log library แทน Log.i

        var counter: Int = 0
        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()
        val thirdFragment = ThirdFragment()

        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                //* Note: You should always use setReorderingAllowed(true) when performing a FragmentTransaction
                setReorderingAllowed(true)
                add<SecondFragment>(R.id.fragment_container_view)
            }
        }

        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                replace<ThirdFragment>(R.id.fragment_container_view2)
                //* Note: You should always use setReorderingAllowed(true) when performing a FragmentTransaction
                setReorderingAllowed(true)
                addToBackStack(null)
            }
        }

        //* ทดลอง ใช้ viewBinding
        binding.tvMainPage.text = counter.toString()
        binding.btnCounter.setOnClickListener {
            Toast.makeText(this,"Button Counter+1 is clicked!!",Toast.LENGTH_SHORT).show()
            binding.tvMainPage.text = counter++.toString()
        }

        binding.btnCallFragment1.setOnClickListener {
            Toast.makeText(this,"Test btn1",Toast.LENGTH_SHORT).show()
            //val fragment1: FirstFragment = supportFragmentManager.findFragmentById(R.id.fragment_container_view2) as FirstFragment
            //if (!=fragment1)
            if (savedInstanceState == null) {
                supportFragmentManager.commit {
                    replace<FirstFragment>(R.id.fragment_container_view2)
                    setReorderingAllowed(true)
                    addToBackStack(null)
                }
            }
        }
        binding.btnCallFragment2.setOnClickListener {
            Toast.makeText(this, "Test btn2", Toast.LENGTH_SHORT).show()
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_container_view2,secondFragment )
                addToBackStack(null)
                commit()
            }
        }
        binding.btnCallFragment3.setOnClickListener {
            Toast.makeText(this, "Test btn3", Toast.LENGTH_SHORT).show()
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_container_view2,thirdFragment )
                addToBackStack(null)
                commit()
            }
        }
    }

    override fun onStart() {
        super.onStart()
        //Log.i(TAG, "onStart: is called.")
        Timber.i("onStart called")     //* ใช้ Timber log library แทน Log.i
    }
    override fun onResume() {
        super.onResume()
        Timber.i("onResume Called")
    }

    override fun onPause() {
        super.onPause()
        Timber.i("onPause Called")
    }

    override fun onStop() {
        super.onStop()
        Timber.i("onStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.i("onDestroy Called")
    }

    override fun onRestart() {
        super.onRestart()
        Timber.i("onRestart Called")
    }

}

