fun sum(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    println("Enter value of a: ")
    val a: Int = readln().toInt()
    println("Enter value for b: ")
    val b: Int = readln().toInt()
    val s = sum(a,b)
    println("Sum = $s")

}