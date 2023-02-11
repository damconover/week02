fun main() {
    println("Enter number of cookies eaten:")
    val numCookies = 3
    val servingSize = 40/10
    val caloriesPerCookie = 300 / servingSize
    val totalCalories = numCookies * caloriesPerCookie
    println("Your calorie intake was: $totalCalories calories.")
}
