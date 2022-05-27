package developer.abdulaziz.beeline.Fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import developer.abdulaziz.beeline.MyData
import developer.abdulaziz.beeline.R
import developer.abdulaziz.beeline.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {
    private lateinit var binding: FragmentThirdBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentThirdBinding.inflate(layoutInflater)

        val list = MyData.list
        val position = MyData.position

        binding.apply {
            thirdItemName.text = list[position].name
            thirdItemCode.text = list[position].code
            thirdItemInfo.text = list[position].info

            thirdItemCode.setOnClickListener {
                val intent = Intent(Intent.ACTION_DIAL)
                val encodeHash = Uri.encode(list[position].code)
                intent.data = Uri.parse("tel:$encodeHash")
                startActivity(intent)
            }
        }

        return binding.root
    }
}