package es.iesluiscarrillo.ListaPelisConGET

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import es.iesluiscarrillo.ListaPelisConGET.adapter.FilmAdapter
import es.iesluiscarrillo.ListaPelisConGET.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.recycler.layoutManager = LinearLayoutManager(this)
        binding.recycler.adapter = FilmAdapter(FilmProvider.filmList)
    }
}