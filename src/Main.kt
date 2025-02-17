import kotlin.system.exitProcess

fun main() {

    val temperature1 = TemperatureConverter(25.0)
    val temperature2 = TemperatureConverter(25.0)
    val temperature3 = TemperatureConverter(77.0)
    val temperature4 = TemperatureConverter(77.0)
    val temperature5 = TemperatureConverter(300.0)
    val temperature6 = TemperatureConverter(300.0)

    println(TemperatureConverter.celciusToFahrenheit(temperature1.temperature))
    println(TemperatureConverter.celciusToKelvin(temperature2.temperature))
    println(TemperatureConverter.fahrenheitToCelcius(temperature3.temperature))
    println(TemperatureConverter.fahrenheitToKelvin(temperature4.temperature))
    println(TemperatureConverter.kelvinToCelcius(temperature5.temperature))
    println(TemperatureConverter.kelvinToFahrenheit(temperature6.temperature))
}

