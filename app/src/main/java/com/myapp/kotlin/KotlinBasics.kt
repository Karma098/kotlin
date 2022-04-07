package com.myapp.kotlin

fun main(){
//    println("Hello World")
    //immutable variable
    val myName = "Hritik"
    print("Hello "+myName)
    print("\nWassup $myName")
    //TODO: Add new functionality

    /*This is
    a multiline
    comment
     */

    //mutable variable
    var myAge = 19    //type int 32 bti

    //Integer TYPES: Byte(8 bit), Short(16 bit),
    //Int (32 bit), Long (64 bit)
    val myByte : Byte = 12
    val myShort : Short = 125
    val myInt : Int = 123123123
    val myLong : Long = 39_812_309_487_120_300

    //Floating Point number types : Float(32 bit), Double (64 bit)
    val myFloat : Float = 13.36f     //By default it assigns double so we have to place 'f'
    val myDouble : Double = 3.1456789456125468

    //Booleans : Boolean is used to represent logical values.
    //It can have two possible values true and false.
    var isSunny: Boolean = true
    isSunny = false

    //Characters
    val letterChar = 'A'
    val digitChar = '$'

    //Strings
    val myStr = "Hello world"
    var firstCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]

    println("\nFirst character "+firstCharInStr)
    println("last character "+lastCharInStr)

    //Arithmetic operatores (+,-,*,/,%)
    var result = 5+3
    println(result)
    result/=2
    println(result)
    result*=3
    println(result)
    result+=5
    println(result)
    result-=1
    println(result)
    result = 15%2
    println(result)
    val a= 5.0
    val b= 3
    var resultDouble:Double = (a/b).toDouble()
    println(resultDouble)

    //Comparison operators (==, !=, <, >, <= , >=)
    val isEqual = 5==3
    println("isEqual is $isEqual")

    val isNotEqual = 5!=5
    //String interpolation
    println("isNotEqual is $isNotEqual")

    println("is5greater3 ${5>3}")

    //Assignment operators (+=, -=, *=, /=, %=)

    //Increament & Decreament operators (++, --)
    var myNum = 5
    myNum++
    println(myNum)
    println(myNum++)
    println(++myNum)

    var heightperson1 = 170
    var heightperson2 = 189

    if(heightperson1>heightperson2){
        println("Use Raw force")
    }else if(heightperson1==heightperson2){
        println("use your power technique 1337")
    }
    else{
        println("Use technique")
    }

    var name = "Hritik"
    when(name){
        "Hritik" -> println("Welcome home")
        "Roy" -> println("Bye")
        "Karma" -> println("tell your real name")
        else -> println("Who are you")
    }

    var month =3
    when(month){
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        12,1,2 -> println("Winter")
        else -> println("Invalid Season")
    }

    var age = 22
    when(age){
        in 21..150 -> println("You may drink ")
        in 18..20 -> println("You may vote now ")
         16,17 -> println("you may drive")
        else -> println("you're too young")
    }

    var x : Any = 13.37
    when(x){
        is Int -> println("$x is an integer")
        is Double -> println("$x is double")
        is String -> println("$x is a string")
        else -> println("None of the above")
    }

    //LOOPS
    /*while(condition){
          code to be executed
      }
     */
    var y = 1
    while (y<=10){
        print("$y ")
        y++
    }
    print("\n")
    var i = 0
    while(i<5){
        var j=0
        while (j<i){
            print("*")
            j++
        }
        print("\n")
        i++
    }
    print("\n")
    var c = 100
    while (c>=0){
        print("$c ")
        c-=2
    }


    print("\n")
    for(num in 1..10){
        print("${2*num}")
    }
    print("\n")
    for (i in 20.downTo(0).step(2)){
        print(i)
    }


}