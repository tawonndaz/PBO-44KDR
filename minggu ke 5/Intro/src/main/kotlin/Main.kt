fun main(args : Array<String>) {
    var nama: String = "Jimmy"
    val umur: Int = 22
    val number1 = 11.1
    val number2 = 33.3
    var result: Double
    val number3: Int = 667788
    val number4: Byte = number1.toInt().toByte()
    val flag = true
    println("Hello, World!")
    println("Nama saya : "+"$nama")
    println("Umur saya : "+"$umur")
    result = number1 + number2
    println("number1 + number2 = $result")
    result = number1 - number2
    println("number1 - number2 = $result")
    result = number1 * number2
    println("number1 * number2 = $result")
    result = number1 / number2
    println("number1 / number2 = $result")
    result = number1 % number2
    println("number1 % number2 = $result")
    println("number3 = $number3")
    println("number4 = $number4")
}