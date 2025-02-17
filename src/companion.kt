class TemperatureConverter {
    companion object {
        fun cToF(x: Int): Int { // °F = °C × (9/5) + 32
           return x*(9/5)+32
        }
        fun fToC(y: Int): Int { // °C = (°F - 32) × 5/9
            return (y-32)*5/9
        }
    }
}