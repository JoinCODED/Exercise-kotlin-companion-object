class TemperatureConverter(val temperature: Double) {
    companion object {
        fun celciusToFahrenheit(temp: Double): String {
            return "${"%.3f".format((temp * 9 / 5) + 32)} Fahrenheit"
        }

        fun celciusToKelvin(temp: Double): String {
            return "${"%.3f".format(temp + 273.15)} Kelvin"
        }

        fun fahrenheitToCelcius(temp: Double): String {
            return "${"%.3f".format((temp - 32) * 5 / 9)} Celsius"
        }

        fun fahrenheitToKelvin(temp: Double): String {
            return "${"%.3f".format((temp - 32) * 5 / 9 + 273.15)} Kelvin"
        }

        fun kelvinToCelcius(temp: Double): String {
            return "${"%.3f".format(temp - 273.15)} Celsius"
        }

        fun kelvinToFahrenheit(temp: Double): String {
            return "${"%.3f".format((temp - 273.15) * 9 / 5 + 32)} Fahrenheit"
        }
    }
}

        /*fun temperatureConvertion(temp: String):String {

            if (temp.toLowerCase().contains("kelvin") || (temp.toLowerCase().contains("k") )){


                if

                numTemperature=(temp.filterNot { it.isLetter()}).toDouble()
                return "${(numTemperature - 273.15) * 9 / 5 + 32} Kelvin"

            }

            else if(temp.toLowerCase().contains("celsius") || (temp.toLowerCase().contains("c") )){

                numTemperature=(temp.filterNot { it.isLetter()}).toDouble()
                return "${((numTemperature * 9 / 5) + 32} Celsius"

            }

            else if(temp.toLowerCase().contains("celsius") || (temp.toLowerCase().contains("c") )){

                numTemperature=(temp.filterNot { it.isLetter()}).toDouble()
                return "${((numTemperature * 9 / 5) + 32} Celsius"

            }

*/