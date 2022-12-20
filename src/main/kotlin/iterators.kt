class Animal(val name:String)
class Zoo(val animal: List<Animal>){
    operator fun iterator(): Iterator<Animal> {
        return animal.iterator()
    }
}
fun main(){
    val animals = listOf<Animal>(Animal("macaco"), Animal("zebra"), Animal("leão"))
    val zoo= Zoo(animals)
    for (animal in zoo){
        println("olha lá! é um ${animal.name}")
    }
}
