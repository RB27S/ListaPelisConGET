package es.iesluiscarrillo.peliculas

class FilmProvider {
    companion object {
        val filmList = listOf<Film>(
            Film(
                title = "Lightyear",
                director = "director",
                year = 2022,
                photo = "https://upload.wikimedia.org/wikipedia/en/f/f9/Lightyear_%28film%29_poster.jpg"
            ),

            Film(
                title = "Padre no hay más que uno 3",
                director = "director",
                year = 2022,
                photo = "https://upload.wikimedia.org/wikipedia/en/thumb/1/1a/Padre_no_hay_mas_que_uno_three.jpg/220px-Padre_no_hay_mas_que_uno_three.jpg"
            ),

            Film(
                title = "Regreso al Futuro",
                director = "Robert Zemeckis",
                year = 1985,
                photo = "https://upload.wikimedia.org/wikipedia/en/d/d2/Back_to_the_Future.jpg"
            ),

            Film(
                title = "Regreso al Futuro II",
                director = "Robert Zemeckis",
                year = 1989,
                photo = "https://upload.wikimedia.org/wikipedia/en/c/c2/Back_to_the_Future_Part_II.jpg"
            ),

            Film(
                title = "Regreso al Futuro III",
                director = "Robert Zemeckis",
                year = 1990,
                photo = "https://upload.wikimedia.org/wikipedia/en/4/4e/Back_to_the_Future_Part_III.jpg"
            )
        )
    }
}