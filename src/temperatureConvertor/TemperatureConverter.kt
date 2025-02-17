package temperatureConvertor

class TemperatureConverter {

    companion object{
        fun celsiusToFehrenheit(celcius:Double):String{
            return "Temp in Celsius: ${((celcius*(9.0/5.0) )+ 32.0).toFloat()}"
        }
        fun fehrenheitToCelsius(fahrenheit:Double):String{
return "Temp in Fehrenheit: ${((fahrenheit-32.0)*(5.0/9.0)).toFloat()}"
        }
        fun celsiusToKelvin(c:Double):String{
            return "Temp in Kelvin: ${(c+273.15).toFloat()}"
        }
    }
}