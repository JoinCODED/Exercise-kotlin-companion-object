
fun main() {

    val kelvinTemp = TemperatureConverter(375.0)
    val celsiuslTemp = TemperatureConverter(30.0)
    val fahrenheitTemp = TemperatureConverter(70.0)

    // k to c
    TemperatureConverter.kelvinToCelsius(kelvinTemp.temperatureDegree)
    // f to c
    TemperatureConverter.fehToCelsius(fahrenheitTemp.temperatureDegree)
    // c to f
    TemperatureConverter.celToFahrenheit(celsiuslTemp.temperatureDegree)
    // k to f
    TemperatureConverter.kelvinToFahrenheit(kelvinTemp.temperatureDegree)
    // c to k
    TemperatureConverter.celsiusToKelvin(celsiuslTemp.temperatureDegree)
    // f to k
    TemperatureConverter.fehToKelvin(fahrenheitTemp.temperatureDegree)
}