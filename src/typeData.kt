fun main(args: Array<String>) {
    //koversi type data
    var n1:Int= 10
    var n2:Int?
    var n25tr:String = "12"
    n2 = n25tr.toInt()
    var n2float:Float?
    n2float=n25tr.toFloat()
    println("n1 = "+n1)
    println("n2 = "+n2)
    println("n2float = "+n2float.toString())

    var xpi:Double=3.14
    println("Xpi = " +xpi)
    var IntPi:Int=xpi.toInt()
    println("IntPi = "+IntPi.toString())
}