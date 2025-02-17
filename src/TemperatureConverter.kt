class TemperatureConverter() {

    companion object {

        fun celsiusToFahrenheit(celsius: Double): String {
            var fahrenheit: Double = (celsius * 9 / 5) + 32
            return "[*] %.1f°C in Fahrenheit: %.1f°F".format(celsius, fahrenheit)
        }

        fun fahrenheitToCelsius(fahrenheit: Double): String {
            var celsius: Double = (fahrenheit - 32) * 5/9
            return "[*] %.1f°F in Celsius: %.1f°C".format(fahrenheit, celsius)

        }

        fun fahrenheitToKelvin(fahrenheit: Double): String {
            var kelvin: Double = (fahrenheit - 32) * 5/9 + 273.15
            return "[*] %.1f°F in Kelvin: %.1f°K".format(fahrenheit, kelvin)
        }

        fun kelvinToFahrenheit(kelvin: Double): String {
            var fahrenheit = (kelvin - 273.15) * 9/5 + 32
            return "[*] %.1f°K in Fahrenheit: %.1f°K".format(kelvin, fahrenheit)
        }

        fun celsiusToKelvin(celsius: Double): String {
            var kelvin = celsius + 273.15
            return "[*] %.1f°C in Kelvin: %.1f°K".format(celsius, kelvin)
        }

        fun kelvinToCelsius(kelvin: Double): String {
            var celsius = kelvin - 273.15
            return "[*] %.1f°K in Celsius: %.1f°C".format(kelvin, celsius)

        }
    }
}