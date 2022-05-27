package developer.abdulaziz.beeline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import developer.abdulaziz.beeline.Fragments.ThirdFragment
import developer.abdulaziz.beeline.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d("MainActivity", "onCreateView: ${R.string.resh}")
    }

    override fun onSupportNavigateUp() = findNavController(R.id.my_navigation_host).navigateUp()
}