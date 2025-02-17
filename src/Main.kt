
fun main() {
    var myTemperatureInCelsius = 39.0
    var temperatureInFahrenheit = TemperatureConverter.toFahrenheit(myTemperatureInCelsius)
    var temperatureInKelvin = TemperatureConverter.fahrenheitToKelvin(80.0)
    println(temperatureInFahrenheit)
    println(temperatureInKelvin)

}