package com.fpinkotlin.functions.exercise02


fun square(n: Int) = n * n

fun triple(n: Int) = n * 3


fun <T,U,V> compose(f: (T) -> V, g: (U) ->T): (U) -> V = { f(g(it))}

// Define a generic compose. The exercise dos not consist in writing the implementation, but the signature.