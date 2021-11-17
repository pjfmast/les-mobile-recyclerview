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

}
