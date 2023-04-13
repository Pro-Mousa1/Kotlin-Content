fun main(args: Array<String>) {
    addition(12, 23.6)
    addition(345, 456.6, 567)
}

fun addition(x:Int, y:Double){
    var jibu = x + y
    println("Answer from additional is $jibu")
}

fun addition(x:Int, y:Double, z:Int){
    var jibu = x + y + z
    println("Answer from additional is $jibu")
}