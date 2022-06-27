open class Animal(size: String, foots: String) {
    init {
        println("Size : $size.")
        println("Foots : $foots.")
    }
    open fun Move(move: String){
        println(" $move")
    }
}

class Mammals(size: String, foots: String): Animal(size, foots) {

    fun Food (food: String){
        println("Mammal eat : $food")
    }
    fun Skin (skin: String){
        println("Mammal Skin : $skin")
    }
    override fun Move(move: String) {
        println("Mammal is : $move")
    }
}

open class Bird(size: String, foots: String): Animal(size, foots) {

    open fun Food (food: String){
        println("Bird eat : $food")
    }
    open fun Skin (skin: String){
        println("Bird Skin : $skin")
    }
    override fun Move(move: String) {
        …