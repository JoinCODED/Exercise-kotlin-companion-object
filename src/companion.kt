class TemperatureConverter {
    companion object {
        fun cToF(x: Int): Int { // °F = °C × (9/5) + 32
           return (x*9/5)+32
        }
        fun fToC(x: Int): Int { // °C = (°F - 32) × 5/9
            return (x-32)*5/9
        }
        fun cToK(x: Int): Int {
            return x+273
        }
        fun fToK(x: Int): Int {
            return fToC(x)+273
        }
    }
}

fun main() {
    val resultInF = TemperatureConverter.cToF(17)
    val resultInC = TemperatureConverter.fToC(48)
    println("$resultInF °F")
    println("$resultInC °C")
    val resultCToK =  TemperatureConverter.cToK(50)
    val resultFToK = TemperatureConverter.fToK(99)
    println("$resultCToK K")
    println("$resultFToK K")
}