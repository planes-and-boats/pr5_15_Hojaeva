fun main() {
    try {
        var age: Int
        print("Введите возраст: ")
        age = readln()!!.toInt()
        print("Стадия жизни: ")
        when (age) {
            in 0..2 -> println("младенец")
            in 3..6 -> println("дошкольный возраст")
            in 7..11 -> println("младший школьный возраст")
            in 12..17 -> println("подросток")
            in 18..25 -> println("юность")
            in 26..60 -> println("зрелость")
            in 61..150 -> println("пожилой возраст")
            else -> println("некорректный возраст")
        }
    }
    catch (e: NumberFormatException) {
        println("неверный формат данных")
    }
}