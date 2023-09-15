fun main(args: Array<String>) {
   // println("What is your name?")
    //val name = readln()
    //println("Hello,$name")
    //println("Enter a number: ")
    //var stringInput = readLine()!!

    //var integer:Int = stringInput.toInt()

    //val first: Int = 10
   // val second: Int = 20
   // val sum = first + second
  //  println("The sum is:$sum")
    //val ch ='i'
    //val vowelconsonant = if (ch =='a'|| ch =='e'|| ch =='i'|| ch == 'o'|| ch == 'u') "vowel" else "consonant"
  //  println("$ch is $vowelconsonant")
//val ch = 'z'
  //  when(ch){
    //    'a','e','i','o','u' -> println("$ch is vowel")
      //  else -> println("$ch is consonant")
        val year = 1900
        var leap = false
        if (year % 4 ==0){
            if (year % 100 == 0) {
                //year is divisible by 400, hence the year is a leap year
                leap = year % 400 == 0
            }else
                leap =true

        }else
            leap = false
    println(if (leap)"$year is a leap year." else "$year is not a leap year.")
    }


    //println("you entered:$Integer")
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
   // println("Program arguments: ${args.joinToString()}")

//}