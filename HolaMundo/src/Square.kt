class Square(name: String, val l: Double): Form(name) {
    override fun area(): Double {
        return l*l
    }

    override fun perimeter(): Double {
        return l*4
    }

}