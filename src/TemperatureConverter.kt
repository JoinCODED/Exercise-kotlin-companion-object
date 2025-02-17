class TemperatureConverter(var temperature: Double) {

    companion object{
        fun toFahrenheit(celsius: Double): List<Any> {
            return listOf(((9/5) * celsius) + 32, " F")
        }

        fun toCelsius(fahrenheit: Double): List<Any>{
            return listOf((fahrenheit-32) * (5/9), " C")
        }

        fun celsiusToKelvin(celsius: Double): List<Any>{
            return listOf(celsius + 273.15, " K")
        }

        fun fahrenheitToKelvin(fahrenheit: Double): List<Any>{
            return listOf((fahrenheit-32) * (5/9)+ 273.15, " K")
        }
    }
}
