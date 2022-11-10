package es.iesluiscarrillo.peliculas.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import es.iesluiscarrillo.peliculas.Film
import es.iesluiscarrillo.peliculas.FilmProvider
import es.iesluiscarrillo.peliculas.R

class FilmAdapter(val filList: List<Film>) : RecyclerView.Adapter<FilmViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return FilmViewHolder(layoutInflater.inflate(R.layout.item_film, parent, false))
    }

    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        val item = filList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = FilmProvider.filmList.size
}