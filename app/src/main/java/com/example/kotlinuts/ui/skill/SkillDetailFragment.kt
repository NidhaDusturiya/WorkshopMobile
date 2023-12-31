package com.example.kotlinuts.ui.skill

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.kotlinuts.databinding.FragmentSkillDetailBinding


class SkillDetailFragment : Fragment(){

    private var _binding: FragmentSkillDetailBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    companion object {
        var EXTRA_NAME = "extra_name"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSkillDetailBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        if (arguments != null) {
            val name = arguments?.getString(EXTRA_NAME)

            val skillImageMap = mapOf(
                "Java" to com.example.kotlinuts.R.drawable.java,
                "Python" to com.example.kotlinuts.R.drawable.python,
                "Kotlin" to com.example.kotlinuts.R.drawable.kotlin,
                "PHP" to com.example.kotlinuts.R.drawable.php
            )
            val imageId = skillImageMap[name]
            if (imageId != null) {
                binding.imgItemPhoto.setImageResource(imageId)
            }
            binding.textSkillDetail.text = name
        }
    }

}
