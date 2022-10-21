package com.gl4.tp

import kotlin.math.abs

data class Rectangle(var p : Point = Point(0,0), var q : Point = Point(1,1)) {

    override fun toString() : String {
        return  "p=$p q=$q"
    }

    fun surface() : Int{
        return abs(p.x-q.x)* abs(p.y-q.y)
    }

}

fun main(){
    //Points
    var p1 = Point(2,2)
    var p2 = Point(1,-3)
    var p3 = Point(-3,2)
    var p4 = Point(-1,2)
    var p5 = Point(-1,3)
    // Rectangles
    var rec1 = Rectangle(p1,p2)
    var rec2 = Rectangle()
    var rec3 = Rectangle(p3)
    var rec4 = Rectangle(q = p5)

    val rectangles = listOf(rec1,rec2,rec3,rec4) ;

    println("Surfaces :")
    for( i in  0..3) {
        println(rectangles[i].surface())
    }

}