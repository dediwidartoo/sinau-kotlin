class Mobil4(val mesin: Int, val roda: Int, val body: Int){
    init {
        println("Mesin: $mesin, Roda: $roda, Body: $body")
    }
}

fun main(args: Array<String>) {
    var mobil = Mobil4(2,3,1)

    println("Mesinku : ${mobil.mesin}")
    println("Rodaku  : ${mobil.roda}")
    println("Bodyku  : ${mobil.body}")
}