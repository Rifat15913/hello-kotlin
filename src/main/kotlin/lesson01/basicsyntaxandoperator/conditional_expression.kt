package lesson01.basicsyntaxandoperator



fun main(args: Array<String>) {
    val a = 10
    val b = 20
    println(max(a, b))
}

fun max(a:Int, b:Int) = if (a > b) a else b