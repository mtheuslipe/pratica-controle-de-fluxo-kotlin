fun main(){
    val x: Int = 2
    if(x in 1..5){
        println("x está no intervalo de 1 até 5")
    }
    println()
    if(x !in 5..10){
        println("x não está no intervalo de 6 até 10")
    }
}