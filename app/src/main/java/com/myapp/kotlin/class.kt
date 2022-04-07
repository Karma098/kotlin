package com.myapp.kotlin

class Person (var firstName: String="John", var lastName:String="Doe"){

    //Initialiser Block
    init {
        println("Initialised a new person object with "+ "firstName = $firstName and lastName = $lastName")
    }
    fun greeting(){
        println("hii $firstName, Namaste ")
    }
}

fun main(){
    var denis = Person("Akabane", "Karma")
    var john = Person()
    var johnPeterson = Person(lastName = "peterson")
    john.greeting()
}