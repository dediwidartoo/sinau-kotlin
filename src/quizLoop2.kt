fun main(args: Array<String>) {
    val a = 5
    for (b in 1..a) {
        for (c in 4 downTo b) { //spasi
            print(" ")
        }
        for (d in 1..b) { //bintang
            print("*")
        }
        println()
    }
}