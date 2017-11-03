import Bonbin1.Companion.test

open class Binatang{
    open fun makan(){
        println("Makan...")
    }

    open fun tidur(){
        println("Tidur...")
    }
}

class Gajah1: Binatang(){
    override fun makan() {
        println("Gajah makan?")
    }

    override fun tidur() {
        println("Gajah tidur?")
    }
}

class Kerbau1: Binatang(){
    override fun makan() {
        println("Kerbau makan")
    }

    override fun tidur() {
        println("Kerbau tidur")
    }
}

class Bonbin1{
    companion object {
        fun test(x:Binatang){
            x.makan()
            x.tidur()
        }
    }
}

fun main(args: Array<String>) {
    val g=Gajah1()
    val k=Kerbau1()

    test(k)
    test(g)

}