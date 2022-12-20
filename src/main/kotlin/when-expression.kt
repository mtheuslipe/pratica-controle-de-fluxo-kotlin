fun main(){
    withAssign("Hello")
    withAssign(1)
    withAssign(3L)
    withAssign("hello")
    withAssign(Whatever())
}
fun withAssign(obj:Any){
    val result= when(obj){
        "Hello"-> println("Olá")
        1-> println("ONE")
        is Long -> println("é Long po!")
        is String -> println("É string")
        else -> println("Unknown")
    }
    return result
}
class Whatever()