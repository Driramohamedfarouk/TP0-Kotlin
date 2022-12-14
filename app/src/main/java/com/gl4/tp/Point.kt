package com.gl4.tp

import kotlin.math.abs

data class Point(var x : Int , var y : Int) {
    fun distance(p : Point , q : Point) :Int {
        return abs(p.x-q.x) + abs(p.y-q.y)
    }

    fun distance(p : Point) :Int {
        return abs(x-p.x) + abs(y-p.y)
    }
}