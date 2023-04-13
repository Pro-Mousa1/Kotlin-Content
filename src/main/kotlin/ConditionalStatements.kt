fun main(args: Array<String>) {
    // IF statements
    var age = 20
    if (age<18){
        println("You are underage")
    }else{
        println("Welcome to the party")
    }

    var weight = 100
    var height = 1.9
    var bmi = weight / (height * height)
    if (bmi<18){
        println("Underweight")
    }else if (bmi<29){
        println("Normal weight")
    }else if (bmi<34){
        println("Overweight")
    }else{
        println("Obese")
    }


    var marks = 80
    if (marks>=80){
        println('A')
    }else if (marks>70){
        println('B')
    }else if (marks>60){
        println('C')
    }else{
        println("Fail")
    }
    // WHEN statements

    var bettingNumber = 3
    when(bettingNumber){
        1 ->{
            println("You lost")
        }
        2 ->{
            println("You lost")
        }
        3 ->{
            println("You won")
        }
        4 ->{
            println("You lost")
        }
        else ->{
            println("Enter a number from 1 - 4 to bet")
        }
    }

}