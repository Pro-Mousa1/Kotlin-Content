package oop

fun main(args: Array<String>) {
    var p1 = Person("Moses", "M")
    p1.setSalary("3M")
    p1.setResidence("Nairobi")

    println(p1.getSalary())
    println(p1.getResidence())
}

class Person(var name:String, var gender:String){
    private var salary:String = ""
    private var residence:String = ""
    // Implement access modifiers for salary and residence
    fun setSalary(salary:String){
        this.salary = salary
    }
    fun getSalary():String{
        return this.salary
    }
    fun setResidence(residence:String){
        this.residence = residence
    }
    fun getResidence():String{
        return this.residence
    }
    fun walk(){
        println("Yeah, I can walk")
    }
    fun run(){
        println("Yeah, I can run")
    }
}