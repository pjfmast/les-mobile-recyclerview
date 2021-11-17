package com.avans.avd.lesrecyclerview.model

/* Use model from omdp api response:
    { "Title":"Paris",
      "Year":"2008",
      "Rated":"R",
      "Released":"20 Feb 2008",
      "Runtime":"130 min",
      "Genre":"Comedy, Drama, Romance",
      "Director":"Cédric Klapisch",
      "Writer":"Cédric Klapisch",
      "Actors":"Fabrice Luchini, Romain Duris, Joffrey Platel",
      "Plot":"A ex-dancer has a heart problem and even with a transplant, he may still only have a few months to live. Time's spent looking at people/life in Paris from his balcony. His single mom sister moves in with her 3 kids to look after him.","Language":"French","Country":"France","Awards":"4 nominations",
      "Poster":"https://m.media-amazon.com/images/M/MV5BMTMxNjMxNjMwOF5BMl5BanBnXkFtZTcwMjA1OTIxMw@@._V1_SX300.jpg",
      "Ratings":[{"Source":"Internet MovieUiModel Database","Value":"6.8/10"},{"Source":"Rotten Tomatoes","Value":"66%"},{"Source":"Metacritic","Value":"68/100"}],
      "Metascore":"68","imdbRating":"6.8","imdbVotes":"12,175","imdbID":"tt0869994","Type":"movie","DVD":"16 Mar 2010","BoxOffice":"$1,010,194","Production":"N/A","Website":"N/A","Response":"True"}
*/

data class MovieUiModel(
    val title: String,
    val genre: String,
    val year: Int,
    val runtime: Int, // in minutes
    val metascore: Int,
    val poster: String, // image url
)