package TemperatureConverter

class TemperatureConverter {

    companion object {
        const val KELVINFREEZINGPOINT = 273.15
        const val FAHRENHEITMULTIPLIER = 9.0 / 5.0
        const val FAHRENHEITMULTIPLIER2 = 5.0 / 9.0
        const val FAHRENHEITFREEZINGPOINT = 32.0

        fun cToF (celsius: Double): Double {
            return  (celsius * FAHRENHEITMULTIPLIER) + FAHRENHEITFREEZINGPOINT
        }
        fun cToK (celsius: Double): Double {
            return  celsius + KELVINFREEZINGPOINT
        }
        fun fToC (fahrenheit: Double): Double {
            return  (fahrenheit - FAHRENHEITFREEZINGPOINT) * FAHRENHEITMULTIPLIER2
        }
        fun fToK (fahrenheit: Double): Double {
            return  fToC(fahrenheit) + KELVINFREEZINGPOINT
        }
        fun kToC (kelvin: Double): Double {
            return kelvin - KELVINFREEZINGPOINT
        }
        fun kToF (kelvin: Double): Double {
            return kToC(kelvin) * FAHRENHEITMULTIPLIER + FAHRENHEITFREEZINGPOINT
        }
    }
}