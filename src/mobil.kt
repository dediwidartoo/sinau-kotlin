class Mobil {
    var mesin=1
    var roda =4
    var body =1

    fun maju(){
        println("Maju...")
    }

    fun mundur(){
        println("Mundur...")
    }

    fun belok(){
        println("Belok...")
    }
}

fun main(args: Array<String>) {
    var avanza = Mobil()
    avanza.maju()
    avanza.mundur()
    avanza.belok()

    println("Mesin : "+avanza.mesin)
    println("Roda  : "+avanza.roda)
    println("Body  : "+avanza.body)
}