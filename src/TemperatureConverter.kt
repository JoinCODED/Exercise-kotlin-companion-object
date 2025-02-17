class TemperatureConverter() {

    companion object {
        var counter: Int = 0

        fun numberOfconversions (){
            return println("Number of conversions so far is $counter")
        }
        fun fromCtoF(temp: Double): Double{
            //°F = °C * 9/5 + 32
            val temp = temp * (9/5) + 32;
            counter++
            return temp
        }
        fun fromCtoK(temp: Double): Double{
            //K = °C + 273.15
            val temp = temp + 273.15;
            counter++
            return temp
        }
        fun fromFtoC(temp: Double): Double{
            //°C = (°F - 32) ÷ (9/5)
            val temp = (temp - 32) / (9/5);
            counter++
            return temp
        }
    }
}