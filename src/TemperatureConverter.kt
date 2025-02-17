class TemperatureConverter {

    companion object {
        fun convertToFahrenheit(temperature: Double): Double {
            return (temperature * 9/5) + 32
        }

        fun convertToCelsius(temperature: Double): Double {
            return (temperature - 32) * 5/9
        }

        fun celsiusConvertToKelvin(temperature: Double): Double {
            return temperature + 273.15
        }

        fun fahrenheitConvertToKelvin(temperature: Double): Double {
            return (temperature - 32) * 5/9 + 273.15
        }

    }
}