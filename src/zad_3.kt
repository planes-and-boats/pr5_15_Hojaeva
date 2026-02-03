fun main() {
    try {
        var P: Int
        var CH: Int
        var TR: Int
        var DV: Int
        var Kids: Int
        print("Введите количество учеников, которые получили 5: ")
        P = readln()!!.toInt()
        while(P < 0) {
            print("Введите количество учеников (>= 0), которые получили 5: ")
            P = readln()!!.toInt()
        }
        print("Введите количество учеников, которые получили 4: ")
        CH = readln()!!.toInt()
        while(CH < 0) {
            print("Введите количество учеников (>= 0), которые получили 4: ")
            CH = readln()!!.toInt()
        }
        print("Введите количество учеников, которые получили 3: ")
        TR = readln()!!.toInt()
        while(TR < 0) {
            print("Введите количество учеников (>= 0), которые получили 3: ")
            TR = readln()!!.toInt()
        }
        print("Введите количество учеников, которые получили 2: ")
        DV = readln()!!.toInt()
        while(DV < 0) {
            print("Введите количество учеников (>= 0), которые получили 2: ")
            DV = readln()!!.toInt()
        }
        Kids = P + CH + TR + DV
        println("Количество учеников в классе: $Kids")
    }
    catch (e: NumberFormatException) {
        println("неверный формат данных")
    }
}