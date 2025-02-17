fun main() {
    var celsius = 32.0
    var fahrenheit = -110.0
    var kelvin = 330.0

    println("Converting Temperature ${celsius}C to Fahrenheit: ${TemperatureConverter.CelsiusToFahrenheit(celsius)}F")
    println("Converting Temperature ${celsius}C to Kelvin: ${TemperatureConverter.CelsiusToKelvin(celsius)}K")


    println("Converting Temperature ${fahrenheit}F to Celsius: ${TemperatureConverter.FahrenheitToCelsius(fahrenheit)}C")
    println("Converting Temperature ${fahrenheit}F to Kelvin: ${TemperatureConverter.FahrenheitToKelvin(fahrenheit)}K")

    println("Converting Temperature ${kelvin}K to Kelvin: ${TemperatureConverter.FahrenheitToCelsius(fahrenheit)}C")
    println("Converting Temperature ${kelvin}K to Kelvin: ${TemperatureConverter.KelvinToFahrenheit(fahrenheit)}K")

}