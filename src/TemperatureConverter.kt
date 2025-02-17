class TemperatureConverter() {


    companion object{
        fun CelsiusToFahrenheit(tempInCelsius:Int):Double{
            return (tempInCelsius * 9.0 / 5.0) + 32
        }

        fun FahrenheitToCelsius(tempInFahrenheit:Int):Double {
            return (tempInFahrenheit - 32) * 5.0 / 9.0
        }
    }
}