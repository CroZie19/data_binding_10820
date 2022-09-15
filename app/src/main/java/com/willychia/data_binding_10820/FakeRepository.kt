package com.willychia.data_binding_10820

import androidx.lifecycle.MutableLiveData
import kotlin.random.Random
import androidx.lifecycle.LiveData

object FakeRepository {
    private val fruitNames: List<String> = listOf(
        "Apel","Mangga","Pisang", "Anggur","Stroberi","Jambu","Rasberi","Bambu",
        "Kiwi","Pir"
    )

    private val _currentRandomFruitname = MutableLiveData<String>()
    val currentRandomFruitNames: LiveData<String>
    get()= _currentRandomFruitname

    init{
        _currentRandomFruitname.value= fruitNames.first()
    }

    fun getRandomfruitName(): String{
        val random = Random.nextInt(fruitNames.size)
        return fruitNames[random]
    }

    fun changeCurrentRandomFruitName(){
        _currentRandomFruitname.value= getRandomfruitName()
    }
}