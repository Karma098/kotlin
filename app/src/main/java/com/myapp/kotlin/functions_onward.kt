package com.myapp.kotlin

fun myFunction(){
    print("Called from myFunction")
}
//Method is a function within a class
//parameter (input)
fun add(a:Int, b:Int):Int{
    var c=a+b
    return c
}

fun avg(a:Double, b:Double):Double{
    var c = (a+b)/2
    return c
}

fun star(a:Int){
    for (i in 1..a){
        for (j in 1..i) print("*")
        print("\n")
    }
}



fun main(){
    //argument
//    var a = add(2,5)
//    print(a)
    var a = avg(8.0,5.2)
    println(a)
    star(6)
}