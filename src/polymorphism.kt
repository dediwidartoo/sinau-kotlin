import Bonbin.Companion.test

class Gajah{
    fun makan(){
        println("Gajah makan...")
    }
    fun tidur(){
        println("Gajah tidur")
    }
}

class Kerbau{
    fun makan(){
        println("Kerbau makan...")
    }
    fun tidur(){
        println("Kerbau tidur")
    }
}

class Bonbin{
    companion object {
        fun test(x:Gajah){
            x.makan()
            x.tidur()
        }
        fun test(x:Kerbau){
            x.makan()
            x.tidur()
        }
    }
}

fun main(args: Array<String>) {
    val g=Gajah()
    val k=Kerbau()

    test(g)
    test(k)
}