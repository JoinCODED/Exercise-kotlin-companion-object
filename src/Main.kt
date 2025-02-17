fun main() {

    val celsius = 44.0
    val fahrenheit = 70.0
    val kelvin = 200.0

    println("$celsius°C = ${TemperatureConverter.celsiusToFahrenheit(celsius)}°F")
    println("$fahrenheit°F = ${TemperatureConverter.fahrenheitToCelsius(fahrenheit)}°C")
    println("$celsius°C = ${TemperatureConverter.celsiusToKelvin(celsius)}K")
    println("$kelvin K = ${TemperatureConverter.kelvinToCelsius(kelvin)}°C")
    println("$fahrenheit°F = ${TemperatureConverter.fahrenheitToKelvin(fahrenheit)}K")
    println("$kelvin K = ${TemperatureConverter.kelvinToFahrenheit(kelvin)}°F")
}