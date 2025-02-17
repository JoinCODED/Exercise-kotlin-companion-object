import temperatureConvertor.*
fun main() {
    var celsius: Double = 10.3
    var feh: Double = 212.1

    println( TemperatureConverter.celsiusToFehrenheit(celsius))
    println(TemperatureConverter.fehrenheitToCelsius(feh))
    println(TemperatureConverter.celsiusToKelvin(29.4))
}