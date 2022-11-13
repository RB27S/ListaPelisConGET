package es.iesluiscarrillo.ListaPelisConGET

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface APIService {
    @GET suspend fun getMoviesByPopularity(@Url url:String): Response<FilmResponse>
}