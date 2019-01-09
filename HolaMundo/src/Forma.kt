open class Form(val name: String) {
    open fun area() = 0.0
}

class Circle(name: String, val radius: Double): Form(name){
    /*override fun area(): Double {
        return Math.PI * Math.pow(radio, 2.0)
    }*/

    override fun area() = Math.PI * Math.pow(radius, 2.0)
}