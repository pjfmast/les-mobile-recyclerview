package com.avans.avd.lesrecyclerview.model

/* Use model from omdp api response: https://www.omdbapi.com/?s=midnight%20in%20paris&apikey=[your api key]
 {
Search: [
{
Title: "Midnight in Paris",
Year: "2011",
imdbID: "tt1605783",
Type: "movie",
Poster: "https://m.media-amazon.com/images/M/MV5BMTM4NjY1MDQwMl5BMl5BanBnXkFtZTcwNTI3Njg3NA@@._V1_SX300.jpg"
},
// ...
],
totalResults: "3",
Response: "True"
}
*/

data class MovieUiModel(
    val title: String,
    val year: Int,
    val imdbID: String,
    val type: String,
    val poster: String, // image url
)