package es.iesluiscarrillo.ListaPelisConGET

class FilmProvider {
    companion object {
        val filmList = listOf<Film>(
            Film(
                title = "Lightyear",
                photo = "https://upload.wikimedia.org/wikipedia/en/f/f9/Lightyear_%28film%29_poster.jpg"
            ),

            Film(
                title = "Padre no hay más que uno 3",
                photo = "https://upload.wikimedia.org/wikipedia/en/thumb/1/1a/Padre_no_hay_mas_que_uno_three.jpg/220px-Padre_no_hay_mas_que_uno_three.jpg"
            ),

            Film(
                title = "Regreso al Futuro",
                photo = "https://upload.wikimedia.org/wikipedia/en/d/d2/Back_to_the_Future.jpg"
            ),

            Film(
                title = "Regreso al Futuro II",
                photo = "https://upload.wikimedia.org/wikipedia/en/c/c2/Back_to_the_Future_Part_II.jpg"
            ),

            Film(
                title = "Regreso al Futuro III",
                photo = "https://upload.wikimedia.org/wikipedia/en/4/4e/Back_to_the_Future_Part_III.jpg"
            )
        )
    }
}