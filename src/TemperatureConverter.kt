class TemperatureConverter {


    companion object{
        fun fahrenheitConverter (c: Double){
            val toFahrenheit =  c * (9/5) +32
            println(toFahrenheit)

        }
        fun CelsuisConverter (f: Double){
            val toCelsuis = (f - 32) * 5/9
            println(toCelsuis)

        }

        fun KalvinConverter(c: Double){
            val toKalvin =  c + 273.15
            println(toKalvin)
        }

    }
}