class TemperatureConverter {
    companion object {
        fun celsiusToFahrenheit(celsius: Double): Double {
            return (celsius * 9 / 5) + 32
        }
        fun fahrenheitToCelsius(fahrenheit: Double): Double {
            return (fahrenheit - 32) * 5 / 9
        }
        fun celsiusToKelvin(celsius: Double): Double {
            return celsius + 273.15
        }
        fun kelvinToCelsius(kelvin: Int): Double {
            return kelvin - 273.15
        }
        fun fahrenheitToKelvin(fahrenheit: Double): Double {
            return (fahrenheit - 32 * 5 / 9 ) + 273.15
        }
        fun kelvinToFahrenheit(kelvin: Int): Double {
            return (kelvin - 273.15) * 9 / 5 + 32
        }
    }
}