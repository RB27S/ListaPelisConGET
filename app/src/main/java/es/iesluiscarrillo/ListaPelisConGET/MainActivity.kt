package es.iesluiscarrillo.ListaPelisConGET

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import es.iesluiscarrillo.ListaPelisConGET.adapter.FilmAdapter
import es.iesluiscarrillo.ListaPelisConGET.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: FilmAdapter
    private val filmImages = mutableListOf<Film>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        initRecyclerView()
        searchByPopularity()
    }

    private fun initRecyclerView() {
        adapter = FilmAdapter(filmImages)
        binding.recycler.layoutManager = LinearLayoutManager(this)
        binding.recycler.adapter = adapter
    }

    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org/3/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private fun searchByPopularity() {
        CoroutineScope(Dispatchers.IO).launch {
            val call:Response<FilmResponse> = getRetrofit().create(APIService::class.java).getMoviesByPopularity("/movie/popular?api_key=17ec01baf46b9efa1282ce4069740ea6")
            val films = call.body()
            runOnUiThread {
                if (call.isSuccessful) {
                    val results = films?.results ?: emptyList()
                    filmImages.clear()

                    for (result in results) {
                        val film = Film(result.title, result.poster_path)
                        filmImages.add(film)
                    }
                    adapter.notifyDataSetChanged()
                } else {
                    showError()
                }
            }
        }
    }

    private fun showError() {
        Toast.makeText(this, "Ha ocurrido un error", Toast.LENGTH_SHORT).show()
    }
}