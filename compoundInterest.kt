import kotlin.math.*
fun main(args: Array<String>) {
    val P = 1000.0 // Principal amount
    val r = 0.04 // Annual interest rate
    val n = 4 // Number of times the interest is compounded per year
    val t = 10 // Number of years
    val e = 40 // Exponent

    // Calculate A
    val A = P * Math.pow(1 + (r / n), e.toDouble())
    println("The amount of money in the account after 4 years is $A")
}
