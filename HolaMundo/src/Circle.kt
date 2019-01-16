class Circle(name: String, val radius: Double): Form(name), Printable {
    override fun area(): Double {
        var a = Math.PI * Math.pow(radius, 2.0)
        printMessage(a.toString())
        return a
    }

    override fun perimeter(): Double {
        var r= 2*(Math.PI)*radius
        printMessage(r.toString())
        return r
    }



    /*override fun area(): Double {
        return Math.PI * Math.pow(radio, 2.0)
    }*/

    //override fun area() = Math.PI * Math.pow(radius, 2.0)
}