class Mobil2 {
    var mesin=1
    var roda =4
    var body =1
}

fun main(args: Array<String>) {
    var avanza = Mobil2()
    var innova = Mobil2()

    println("Roda avanza : "+avanza.roda)
    println("Roda innova : "+innova.roda)
    avanza.roda = 5
    println("Roda avanza : "+avanza.roda)
    println("Roda innova : "+innova.roda)

    println("Mesin avanza : "+avanza.mesin)
    println("Mesin innova : "+innova.mesin)
    avanza.mesin = 2
    println("Mesin avanza : "+avanza.mesin)
    println("Mesin innova : "+innova.mesin)
}