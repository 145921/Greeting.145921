import java.util.*    // required import
//fun feedTheFish() {
   // val day = randomDay()
   // val food = "pellets"
   /*println("Today is $day and the fish eat $food")
}*/
fun randomDay() : String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}
   fun fishFood (day : String) : String {
       //var food = ""
      return  when (day) {
           "Monday" ->  "flakes"
         //  "Tuesday" -> food = "pellets"
           "Wednesday" -> "redworms"
           "Thursday" ->  "granules"
           "Friday" -> "mosquitoes"
          // "Saturday" -> food = "lettuce"
           "Sunday" -> "plankton"
           else -> "nothing"
       }

   }


fun swim(speed: String = "fast") {
    println("swimming $speed")
}
/*fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        temperature > 30 -> true
        dirty > 30 -> true
        day == "Sunday" ->  true
        else -> false
    }
}*/
fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println ("Today is $day and the fish eat $food")
    println("Change water: ${shouldChangeWater(day)}")
}
fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"

fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else  -> false
    }
}





fun main(args: Array<String>) {
    //swim()   // uses default speed
    //swim("slow")   // positional argument
    //swim(speed="turtle-like")   // named parameter
    feedTheFish()
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
      //  val year = 1900
       /* var leap = false
        if (year % 4 ==0){
            if (year % 100 == 0) {
                //year is divisible by 400, hence the year is a leap year
                leap = year % 400 == 0
            }else
                leap =true

        }else
            leap = false
    println(if (leap)"$year is a leap year." else "$year is not a leap year.")*/
   // println("Hello, world!")
   // println("Hello, ${args[0]}")
   // val isUnit = println("This is an expression")
   // println(isUnit)
    //val temperature = 10
    //val isHot = if (temperature > 50) true else false
    //println(isHot)
    //val temperature = 10
   // val message = "The water temperature is ${if (temperature > 50)"too warm" else "ok"}."
    //println(message)

    }


//println("you entered:$Integer")
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
   // println("Program arguments: ${args.joinToString()}")

//}