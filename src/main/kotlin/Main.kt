fun main(args: Array<String>) {
    val money: String
    println("How much money you got?")
    money = readln()
    val moneyasint: Int = money.toInt()
    println("Well I have $" + moneyasint*2)
}