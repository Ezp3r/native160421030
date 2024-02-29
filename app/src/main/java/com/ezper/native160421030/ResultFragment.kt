package com.ezper.native160421030

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ezper.native160421030.databinding.FragmentGameBinding
import com.ezper.native160421030.databinding.FragmentResultBinding

class ResultFragment : Fragment() {

    private lateinit var binding: FragmentResultBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentResultBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if(arguments != null){
            val score = ResultFragmentArgs.fromBundle(requireArguments()).score
            binding.txtGameOver.text = "GAME OVER"
            binding.txtScore.text = "Your score is $score"
        }

        binding.btnHome.setOnClickListener {
            val action = ResultFragmentDirections.actionHomeFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }

}