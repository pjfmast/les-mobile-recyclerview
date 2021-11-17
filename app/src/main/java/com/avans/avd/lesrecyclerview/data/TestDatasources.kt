package com.avans.avd.lesrecyclerview.data

import com.avans.avd.lesrecyclerview.model.*
import com.avans.avd.lesrecyclerview.model.CatUiModel

class TestDatasources {
    fun loadCats(): List<CatUiModel> {
        return (
                listOf(
                    CatUiModel(
                        Gender.Male,
                        CatBreed.BalineseJavanese,
                        "Fred",
                        "Silent and deadly",
                        "https://cdn2.thecatapi.com/images/DBmIBhhyv.jpg"
                    ),
                    CatUiModel(
                        Gender.Female,
                        CatBreed.ExoticShorthair,
                        "Wilma",
                        "Cuddly assassin",
                        "https://cdn2.thecatapi.com/images/KJF8fB_20.jpg"
                    ),
                    CatUiModel(
                        Gender.Unknown,
                        CatBreed.AmericanCurl,
                        "Curious George",
                        "Award winning investigator",
                        "https://cdn2.thecatapi.com/images/vJB8rwfdX.jpg"
                    )
                )
                )
    }

    fun loadMovies(): List<MovieUiModel> {
        return listOf(
            MovieUiModel(
                "Midnight in Paris",
                2011,
                "tt1605783",
                "movie",
                "https://m.media-amazon.com/images/M/MV5BMTM4NjY1MDQwMl5BMl5BanBnXkFtZTcwNTI3Njg3NA@@._V1_SX300.jpg"
            ),
            MovieUiModel(
                "From Paris with Love",
                2010,
                "tt1179034",
                "movie",
                "https://m.media-amazon.com/images/M/MV5BODAwMDFjNjktMWY2Mi00MmVhLWI0MjYtNzg4OTI0NzA5YzBjXkEyXkFqcGdeQXVyNTIzOTk5ODM@._V1_SX300.jpg"
            ),
            MovieUiModel(
                "Paris, Texas",
                1984,
                "tt0087884",
                "movie",
                "https://m.media-amazon.com/images/M/MV5BM2RjMmU3ZWItYzBlMy00ZmJkLWE5YzgtNTVkODdhOWM3NGZhXkEyXkFqcGdeQXVyNDA5Mjg5MjA@._V1_SX300.jpg"
            ),
            MovieUiModel(
                "Paris, je t'aime",
                2006,
                "tt0401711",
                "movie",
                "https://m.media-amazon.com/images/M/MV5BMTc1MDgwNDE4MF5BMl5BanBnXkFtZTcwMTQzMzc0MQ@@._V1_SX300.jpg"
            )
        )
    }
}
