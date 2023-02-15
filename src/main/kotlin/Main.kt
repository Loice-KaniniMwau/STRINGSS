fun main() {
    school("akirachix")
    println(identity(27,"margaret"))
    println(thesize("akirachix"))

    //that's me
    val identity1="maryanne"
    val identity2="maryanne"
    if (identity1==identity2){
        println("that's me")
    }else {
        println("I don't know who that is")
    }
    // I don't know who that is
    val name1="maryanne"
    val name2="faith"
    if(name1==name2){
        println("Tha's me")
    }else{
        println("I don't know who that is")
    }




}
    fun school(institution:String){
     println(institution[0])
    println(institution[2])
    println(institution[3])

}

fun identity(age: Int,name:String):String{
   return("My name is $name and I am $age years old")

}
fun thesize(thesize:String):Int{
    return(thesize.length)


}


