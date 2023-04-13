package oop

fun main(args: Array<String>) {
    // InheritanceAndPolymorphism
    var std1 = Student("Mousa", "mousa@gmail.com", "mousa123")

    std1.login()
    std1.register()

    var t1 = Teacher("Prof.Mousa", "mousa@gmail.com", "mousa1234")

    t1.login()
    t1.register()
    t1.suspendStudent()

    var ht1 = HeadTeacher("Dr.Ines", "ines@gmail.com", "ines12345")

    ht1.register()
    ht1.login()
    ht1.suspendStudent()
    ht1.approveFunds()

}

open class Student( open var name:String, open var email:String, open var password:String){

    fun register(){
        println("You registered with $email and password $password")
    }
    fun login(){
        println("You logged in with $email and password $password")
    }
}

open class Teacher(name:String, email:String, password:String):Student(name, email, password){
    fun suspendStudent(){
        println("Yeah, I can suspend a student")
    }
}

class HeadTeacher(name:String, email:String, password:String):Teacher(name, email, password){
    fun approveFunds(){
        println("Yeah, I can approve funds")
    }
}