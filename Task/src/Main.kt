fun main() {

    var celsius = 20.0
    var fahrenheit = 80.0

    println("$celsius°C = ${TemperatureConverter.celsiusToFahrenheit(celsius)}°F")
    println("$fahrenheit°F = ${TemperatureConverter.fahrenheitToCelsius(fahrenheit)}°C")
    println("$celsius°C = ${TemperatureConverter.celsiusToKelvin(celsius)}K")
}