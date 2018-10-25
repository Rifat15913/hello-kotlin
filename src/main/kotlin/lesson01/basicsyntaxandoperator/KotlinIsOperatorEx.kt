package lesson01.basicsyntaxandoperator

open class Base
class Derived : Base()

fun main(args: Array<String>) {

    val b = Base()
    val d = Derived()

    println(d is Base)
    println(b is Derived)
    println(d is Any)
}