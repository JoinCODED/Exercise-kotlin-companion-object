class TemperatureConverter {
    companion object {
        fun cToF(celsius: Double): Double {
            return (celsius * 9/5) + 32
        }

        fun fToC(fahrenheit: Double): Double {
            return (fahrenheit - 32) * 5/9
        }

        fun cToK(celsius: Double): Double {
            return celsius + 273.15
        }

        fun kToC(kelvin: Double): Double {
            return kelvin - 273.15
        }
    }
}

