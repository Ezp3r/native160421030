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

        val rnds1 = (0..100).random()
        val rnds2 = (0..100).random()

        val score = 0

        if(arguments != null){
            val playername = GameFragmentArgs.fromBundle(requireArguments()).playerName
            binding.txtTurn.text = "$playername's turn"
            binding.txtRand.text = "$rnds1 + $rnds2"
        }

        binding.btnSubmit.setOnClickListener {
            val answer = Integer.parseInt(binding.txtAnswer.text.toString())
            if (rnds1 + rnds2 == answer){
                score+1
                val rnds1 = (0..100).random()
                val rnds2 = (0..100).random()
                binding.txtRand.text = "$rnds1 + $rnds2"
                binding.txtAnswer.setText(0)
            }
            else{
                val action = GameFragmentDirections.actionResultFragment(score)
                Navigation.findNavController(it).navigate(action)
            }
        }
    }

}