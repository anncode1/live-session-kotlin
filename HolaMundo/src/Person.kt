class Person {
    //Encapsuar datos
    private val date : String = "12 diciembre"

    //No se necesitan definir explicitamente getter y setter
    var firstName: String? = null
    var lastName: String? = null

    var name: String
        //get() = field
        get() = firstName + "***" + lastName
        set(value) {
            //field = value
            var nameArray = value.split(" ".toRegex())
            firstName = nameArray[0]
            lastName = nameArray[1]
        }

    var nickname = "nickname"



}