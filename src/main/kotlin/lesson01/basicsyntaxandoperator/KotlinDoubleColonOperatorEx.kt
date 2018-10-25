package lesson01.basicsyntaxandoperator

fun main(args: Array<String>) {

    val c = String::class

    c.supertypes.forEach { e -> println(e) }

    val words = listOf("car", "forest", "Bible")
    println(words.map(String::length))
}