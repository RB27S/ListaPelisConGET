package es.iesluiscarrillo.ListaPelisConGET.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import es.iesluiscarrillo.ListaPelisConGET.Film
import es.iesluiscarrillo.ListaPelisConGET.databinding.ItemFilmBinding

class FilmViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val binding = ItemFilmBinding.bind(view)
    fun render(filmModel: Film) {
        binding.FilmName.text = filmModel.title
        Glide.with(binding.FilmPhoto.context).load("https://image.tmdb.org/t/p/w500/${filmModel.photo}").into(binding.FilmPhoto)

        itemView.setOnClickListener {Toast.makeText(binding.FilmPhoto.context, filmModel.title, Toast.LENGTH_SHORT).show()}
    }
}