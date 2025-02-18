class TemperatureConverter {
    companion object {
        fun celsiusToFahrenheit(celsius: Double): Double {
            return (celsius * 9 / 5) + 32
        }
        fun fahrenheitToCelsius(fahrenheit: Double): Double {
            return (fahrenheit - 32) * 5 / 9
        }
    }
}
fun main() {
    val celsius = 25.0
    val fahrenheit = 77.0
    println("$celsius°C is ${TemperatureConverter.celsiusToFahrenheit(celsius)}°F")
    println("$fahrenheit°F is ${TemperatureConverter.fahrenheitToCelsius(fahrenheit)}°C")
}
