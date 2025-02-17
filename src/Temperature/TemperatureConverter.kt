package Temperature

class TemperatureConverter {

    companion object{
        fun convertToF(temperature:Double):Double{
           return (temperature*(9.0/5.0)) + 32.0
        }
        fun convertToC(temperature:Double):Double{
            return (temperature-32.0) * (5.0/9.0)
        }
        fun convertToK(temperature:Double):Double{
            return temperature+273.15
        }
    }
}