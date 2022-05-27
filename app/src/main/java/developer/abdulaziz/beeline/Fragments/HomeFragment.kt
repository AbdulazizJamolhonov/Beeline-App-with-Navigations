package developer.abdulaziz.beeline.Fragments

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import developer.abdulaziz.beeline.R
import developer.abdulaziz.beeline.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater)

        binding.apply {
            tariflar.setOnClickListener {
                findNavController().navigate(R.id.secondFragment, bundleOf("key" to 1))
            }
            internet.setOnClickListener {
                findNavController().navigate(R.id.secondFragment, bundleOf("key" to 2))
            }
            xizmatlar.setOnClickListener {
                findNavController().navigate(R.id.secondFragment, bundleOf("key" to 4))
            }
            sms.setOnClickListener {
                findNavController().navigate(R.id.secondFragment, bundleOf("key" to 5))
            }
            ilovalar.setOnClickListener {
                findNavController().navigate(R.id.secondFragment, bundleOf("key" to 6))
            }
        }

        return binding.root
    }
}