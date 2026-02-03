fun main()
{
    try
    {
        var name: Int
        println("Введите имя:")
        name = readln()!!.toInt()
        println("Здравствуйте, $name")
    }
    catch (e:NumberFormatException)
    {
        println("неверный формат данных")
    }
}