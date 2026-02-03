fun main() {
    try {
        var x: Double
        var f: Double
        f = 0.0
        print("Введите значение x: ")
        x = readln()!!.toDouble()
        when {
            (x > 1.1) -> f = 9 - x
            (x <= 1.1) -> f = Math.sin(x*3) / (Math.pow(x, 4.0) + 4)
        }
        println("Значение функции с данном значением x: $f")
    }
    catch (e: NumberFormatException) {
        println("неверный формат данных")
    }
}