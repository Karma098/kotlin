package com.myapp.kotlin

fun main(){
    var name :String= "Hritik"
//    name = null -> compilation error
    var nullableName : String? = "Hritik"
//    nullableName = null

    var len = name.length
//    var len2 = if (nullableName == null) null else nullableName.length
    var len2 = nullableName?.length
    nullableName?.let{ println(it.length)}

    //?: elvis operator
    val name1 = nullableName?: "Default"
    println("name is $name1")

    println(nullableName!!.toLowerCase())
}