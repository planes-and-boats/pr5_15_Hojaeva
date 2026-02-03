fun main() {
    try {
        var num: Int
        print("Введите трехзначное число: ")
        num = readln()!!.toInt()
        when {
            ((num % 10) % 2 != 0) -> println("последняя цифра числа нечетная")
            else -> println("последняя цифра числа четная")
        }
    }
    catch (e: NumberFormatException) {
        println("неверный формат данных")
    }
}