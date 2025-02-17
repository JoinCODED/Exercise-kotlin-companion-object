package tempConverter

class TempConverter {


    companion object {
        fun celsiusToFahrenheit(temp: Double): Float {
            return ((9.0/5.0)*temp + 32.0).toFloat()
        }

        fun fahrenheitToCelsius(temp: Double): Float {
            return ((5.0/9.0)*(temp-32)).toFloat()
        }

        fun clesiusToKelvin (temp: Double): Float {
            return (temp+273.15).toFloat()
        }
    }
}