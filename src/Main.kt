import Temperature.*

fun main() {
    var temp1 = 25.0
    println("$temp1 C in F: " + TemperatureConverter.convertToF(temp1))
    var temp2 = 77.0
    TemperatureConverter.convertToC(temp2)
    println("$temp2 F in C: " + TemperatureConverter.convertToC(temp2))
    var temp3 = 290
    println("$temp3 C in K: " + TemperatureConverter.convertToC(temp2))
}