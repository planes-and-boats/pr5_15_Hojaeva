fun main() {
    try {
        var num: Int
        print("Введите число от 0 до 9: ")
        num = readln()!!.toInt()
        print("Число: ")
        when (num) {
            0 -> println("ноль")
            1 -> println("один")
            2 -> println("два")
            3 -> println("три")
            4 -> println("четыре")
            5 -> println("пять")
            6 -> println("шесть")
            7 -> println("семь")
            8 -> println("восемь")
            9 -> println("девять")
            else -> println("число вне диапозона")
        }
    }
    catch (e: NumberFormatException) {
        println("неверный формат данных")
    }
}