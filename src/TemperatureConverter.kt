class TemperatureConverter {

companion object{

    fun celsiusToFahrenheit(temprature:Double):Double{
        return ((temprature * 9.0 / 5.0) + 32.0)
    }

    fun fahrenheitToCelsius(temprature: Double):Double{
        return(temprature - 32) * 5 / 9
    }
}
}