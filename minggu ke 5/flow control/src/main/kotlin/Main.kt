fun main(args: Array<String>) {

    first@ for (i in 1..4) {

        second@ for (j in 1..4) {
            println("i = $i; j = $j")

            if (j == 2)
                break@first
        }
    }
}