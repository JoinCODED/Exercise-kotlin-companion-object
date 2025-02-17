class TemperatureConverter {
    companion object {

        fun convertCelsiusToFahrenheit(temperature: Double): Double {
            return temperature * 1.8 + 32
        }

        fun convertFahrenheitToCelsius(temperature: Double): Double {
            return (temperature - 32) / 1.8
        }

        fun convertFahrenheitToKelvin(temperature: Double): Double {
            return (temperature - 32) / 1.8 + 273.15
        }
        fun convertCelsiusToKelvin(temperature: Double): Double {
            return temperature + 273.15
        }
    }
}