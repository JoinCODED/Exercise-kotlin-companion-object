class TemperatureConverter(val temperatureDegree: Double) {
    companion object {

        fun fehToCelsius(temperature: Double){
            val celsius: Double = (temperature - 32.0) * (5.0 / 9.0)
            println("The temperature from F to C is: $celsius")
        }

        fun kelvinToCelsius(temperature: Double) {
            val celsius: Double = temperature - 273.15
            println("The temperature from K to C is: $celsius")
        }

        fun celToFahrenheit(temperature: Double) {
            val fahrenheit: Double = (temperature * (9.0 / 5.0)) + 32.0
            println("The temperature from C to F is: $fahrenheit")
        }

        fun kelvinToFahrenheit(temperature: Double) {
            val fahrenheit: Double = (temperature - 273.15) * (9.0 / 5.0) + 32.0
            println("The temperature from K to F is: $fahrenheit")
        }

        fun celsiusToKelvin(temperature: Double) {
            val kelvin: Double = temperature + 273.15
            println("The temperature from C to K is: $kelvin")
        }

        fun fehToKelvin(temperature: Double) {
            val kelvin: Double = (temperature - 32.0) * (5.0 / 9.0) + 273.15
            println("The temperature from F to K is: $kelvin")
        }
    }
}
