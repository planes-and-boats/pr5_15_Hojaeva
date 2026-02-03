fun main() {
    try {
        var num1: Double
        var num2: Double
        print("введите первое число: ")
        num1 = readln()!!.toDouble()
        print("введите второе число: ")
        num2 = readln()!!.toDouble()
        if (num1 > num2) {
            num1 += 1
            println("Первое число больше")
        }
        else if (num1 < num2) {
            num2 += 1
            println("Второе число больше")
        }
        else {
            num1 = num1 * num1 * num1
            println("Числа равны")
        }
        println("Первое число: $num1")
        println("Второе число: $num2")
    }
    catch (e:NumberFormatException) {
        println("неверный формат данных")
    }
}
