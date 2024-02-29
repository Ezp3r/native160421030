package com.ezper.native160421030

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ezper.native160421030.databinding.FragmentGameBinding
import com.ezper.native160421030.databinding.FragmentMainBinding
import java.util.Random

class GameFragment : Fragment() {

    private lateinit var binding: FragmentGameBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentGameBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var rnds1 = (0..100).random()
        var rnds2 = (0..100).random()

        var score = 0

        if(arguments != null){
            val playerName = GameFragmentArgs.fromBundle(requireArguments()).playerName
            binding.txtTurn.text = "$playerName's turn"
            binding.txtRand.text = "$rnds1 + $rnds2"
        }

        binding.btnSubmit.setOnClickListener {
            var answer = Integer.parseInt(binding.txtAnswer.text.toString())
            if (rnds1 + rnds2 == answer){
                score = score+1
                rnds1 = (0..100).random()
                rnds2 = (0..100).random()
                binding.txtRand.text = "$rnds1 + $rnds2"
            }
            else{
                val action = GameFragmentDirections.actionResultFragment(score)
                Navigation.findNavController(it).navigate(action)
            }
        }
    }

}