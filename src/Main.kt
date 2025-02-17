fun main() {

    var celsiusTemperature = 30.0
    var fahrenheitResult = TemperatureConverter.fahrenheitToCelsius(celsiusTemperature)
    println("$celsiusTemperature C is $fahrenheitResult F")

    var fahrenheitTemperature = 20.0
    var celsiusResult = TemperatureConverter.celsiusToFahrenheit(fahrenheitResult)
    println("$fahrenheitTemperature F is $celsiusResult")

    println("50 K is ${TemperatureConverter.kelvinToCelsius(50.0)} C")
}
