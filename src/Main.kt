fun main() {
    val celsius = 25.0
    val fahrenheit = TemperatureConverter.cToF(celsius)
    println("$celsius°C = $fahrenheit°F")

    val fahrenheitValue = 77.0
    val celsiusConverted = TemperatureConverter.fToC(fahrenheitValue)
    println("$fahrenheitValue°F = $celsiusConverted°C")

    val kelvin = TemperatureConverter.cToK(celsius)
    println("$celsius°C = $kelvin K")

    val kelvinValue = 300.0
    val celsiusFromKelvin = TemperatureConverter.kToC(kelvinValue)
    println("$kelvinValue K = $celsiusFromKelvin°C")
}