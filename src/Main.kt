fun main() {
    println("Hello World!")
    val temp = TemperatureConverter.fromCtoF(83.0)
    TemperatureConverter.fromCtoF(72.3)
    TemperatureConverter.fromCtoF(892.3)
    TemperatureConverter.fromCtoF(332.3)

    println(temp)
    TemperatureConverter.numberOfconversions()

}