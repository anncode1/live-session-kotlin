fun main(args: Array<String>) {
    println("Hola Ann")

    val studen: Student = Student()
    var person: Person = Person()
    person.name = "Ann Salgado"
    println(person.name)
    println("Tu nombre estrella es: ${person.name}")


    //Herencia
    val circle = Circle("Circulo", 4.0)
    println(circle.name)
    println(circle.radius)
    println(circle.area())

    var form = Form("Cuadradpo")


}