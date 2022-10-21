package com.gl4.tp


// Créez une liste ordonnée de plusieurs languages de programation
private val languages = listOf("C","C++","Java","Python")

fun main(argv : Array<String> )  {
    /*
    val hello = "Hello"
    hello = "Hello world!"
    */
    // une variable declare val est immutable
    var hello = "Hello"
    hello = "Hello world!"


    println(hello)

    var toto: String = "Toto"

    println(toto)

    var message: String? = "I’m learning Kotlin!"
    message = null
    println(message.toString())

    println("Languages :")
    showList(languages)
    println("Odd Numbers to 10 :")
    oddNumbersTo10()


    print(operation(5,2,"/"))

}

fun sayMyName(name : String) { println(" $name ") }

fun sayHello() = "Hello"

fun add(a : Int , b: Int) : Int{
    return a+b
}

fun showList(list: List<String>){
    // Complétez la fonction pour afficher les éléments de la liste
    for (element in list){
        print("$element ")
    }
    println()
}
fun oddNumbersTo10(){
    // Complétez la fonction pour afficher les nombres impairs jusqu'à 10
    for ( i in 1..10 step 2 ){
        print("$i ")
    }
    println()
}


fun operation(a : Int , b : Int , op : String) :Int{
    when (op) {
        "+" -> return a + b
        "-" -> return a - b
        "/" -> return a / b
        "*" -> return a * b
        "%" -> return a % b
        else -> print("Operation Impossible")
    }
    return -1 ;
}




