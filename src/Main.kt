import tempConverter.TempConverter
import tempConverter.TempConverter.Companion.fahrenheitToCelsius

fun main() {

    val resultCelsius = TempConverter.celsiusToFahrenheit(23.0)
    println("The temp in C is $resultCelsius")

    val resultFerh =    TempConverter.fahrenheitToCelsius(72.0)
    println("The temp in F is $resultFerh")

    val resultKelvin = TempConverter.clesiusToKelvin(32.0)
    println("The temp in Keliven is $resultKelvin")
}