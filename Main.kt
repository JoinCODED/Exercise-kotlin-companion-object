class TemperatureConverter(){
    companion object{
        fun CtoF(celsius: Double): Double {
            return (celsius * 9/5) + 32
        }

        fun FtoC(fahrenheit: Double): Double {
            return (fahrenheit - 32) * 5/9
        }
        fun KtoC(kelvin: Double): Double {
            return kelvin - 273.15
        }
        fun KtoF(kelvin: Double): Double {
            return (kelvin - 273.15) * 9/5 + 32 }

    }
}

fun main(){
    val celsius = 100.0
    val fahrenheit = 50.0
    val kelvin = 200.0
    println(TemperatureConverter.CtoF(celsius))
    println(TemperatureConverter.FtoC(fahrenheit))
    println(TemperatureConverter.KtoC(kelvin))
    println(TemperatureConverter.KtoF(kelvin))


}
