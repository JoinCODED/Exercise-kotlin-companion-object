fun main() {
    val celsius = 25.0
    val fahrenheit = 77.0
    val kelvin = 350

    println("Celsius to Fahrenheit:")
    println("$celsius°C = ${TemperatureConverter.celsiusToFahrenheit(celsius)}°F")

    println("Fahrenheit to Celsius:")
    println("$fahrenheit°F = ${TemperatureConverter.fahrenheitToCelsius(fahrenheit)}°C")

    println("Kelvin to Celsius:")
    println("$kelvin K = ${TemperatureConverter.kelvinToCelsius(kelvin)}°C")

    println("Celsius to Kelvin:")
    println("$celsius°C = ${TemperatureConverter.celsiusToKelvin(celsius)}K")

    println("Fahrenheit to Kelvin:")
    println("$fahrenheit°F = ${TemperatureConverter.fahrenheitToKelvin(fahrenheit)}K")

    println("Kelvin to Fahrenheit:")
    println("$kelvin K = ${TemperatureConverter.kelvinToFahrenheit(kelvin)}°F")
}