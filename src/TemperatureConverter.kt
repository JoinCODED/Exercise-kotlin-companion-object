class TemperatureConverter {

    companion object {

        fun celsiusToFahrenheit(celsius: Double): Double {
            return (celsius * 9/5) + 32
        }

        fun fahrenheitToCelsius(fahrenheit: Double): Double = (fahrenheit - 32) * 5/9

        fun kelvinToCelsius(kelvin: Double): Double = kelvin - 273.15
    }
}