fun main(){
    cases("Hello")
    cases('a')
    cases(3L)
    cases(1)
    cases("hello")
    cases(MyClass())

}
fun cases(obj:Any){
    when(obj){
        "Hello" -> println("Olá!")
        is String -> println("é String!")
        is Long -> println("É long, ok?")
        1 -> println("ONE")
        "hello" -> println("oi!")
        else -> println("Unknown")
    }
}

class MyClass()