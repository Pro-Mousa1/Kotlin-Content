fun main(args: Array<String>) {
    motto()
    add()
    avg( 126, 754.45, 43.5f)
    println(sum(123, 45.3))
}

fun motto(){
    println("Hello, this is our motto")
}

fun add(){
    var x = 10
    var y = 20
    var z = x + y
    println(z)
}

fun avg(x:Int, y:Double, z:Float){
    var answer = (x + y + z) / 3.0
    println("Your average is $answer")
}

fun sum(x:Int, y:Double):Double{
    var jibu = x + y
    return jibu
}