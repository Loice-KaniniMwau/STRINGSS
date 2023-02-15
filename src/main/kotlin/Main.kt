fun main() {
    school("akirachix")
    println(identity(27,"margaret"))
    println(thesize("akirachix"))
    println(myname("joanne"))
    println()

    }



            //question1
           fun school(institution: String) {
            println(institution[0])
            println(institution[2])
            println(institution[3])

        }
           //question2
        fun identity(age: Int, name: String): String {
            return ("Hi, My name is $name and I am $age years old")

        }
              //question3
        fun thesize(thesize: String): Int {
            return (thesize.length)


        }

      //I don't know who that is
      fun myname(myname:String) {
       val nickname = "maryanne"
       if (myname == nickname) {
        println("that's me")
        } else {
        println("I don't know who that is")
        }










    }