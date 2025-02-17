class TemperatureConverter() {

    companion object {
        fun CelsiusToFahrenheit(temperature: Double): Double { return (temperature - 32) * 9/5 }
        fun FahrenheitToCelsius(temperature: Double): Double { return temperature - 273.15 }

        fun CelsiusToKelvin(temperature: Double): Double { return temperature + 273.15 }
        fun KelvinToCelsius(temperature: Double): Double { return temperature - 273.15 }

        fun FahrenheitToKelvin(temperature: Double): Double { return (temperature - 32) * 5/9 + 273.15 }
        fun KelvinToFahrenheit(temperature: Double): Double { return (temperature - 273.15) * 9/5 + 32 }
    }
}

//        fun toCelsius(temperature: Double, unit: String): Double? {
//            if (unit == "C" || unit == "Celsius") {
//                return temperature
//            } else if (unit == "F" || unit == "Fahrenheit") {
//                return (temperature - 32) * 5/9
//            } else if (unit == "K" || unit == "Kelvin") {
//                return temperature - 273.15
//            }
//            return null
//
//        }
//        fun toKelvin(temperature: Double, unit: String): Double? {
//            if (unit == "C" || unit == "Celsius") {
//                return temperature + 273.15
//            } else if (unit == "F" || unit == "Fahrenheit") {
//                return (temperature - 32) * 5/9 + 273.15
//            } else if (unit == "K" || unit == "Kelvin") {
//                return temperature
//            }
//            return null
//
//        }
//        fun toFahrenheit(temperature: Double, unit: String): Double? {
//            if (unit == "C" || unit == "Celsius") {
//                return (temperature * 9/5) + 32
//            } else if (unit == "F" || unit == "Fahrenheit") {
//                return temperature
//            } else if (unit == "K" || unit == "Kelvin") {
//                return (temperature - 273.15) * 9/5 + 32
//            }
//            return null
//
//        }
//    }
