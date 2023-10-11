//import jdk.internal.org.jline.utils.Colors.s
import GoldColor.color
import java.util.*
//import kotlin.collections.EmptyList.size
import kotlin.math.PI

open class Aquarium (open var length: Int = 100, open var width: Int = 20, open var height: Int = 40) {
    open val shape = "rectangle"
    open var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }
    open var water: Double = 0.0
        get() = volume * 0.9
    fun printSize() {
        //val shape = null
        println(shape)
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
        // 1 l = 1000 cm^3
        println("Volume: $volume liters Water: $water liters (${water / volume * 100.0}% full)")



    }
    interface FishAction  {
        fun eat()
    }


    fun buildAquarium() {
        /*val aquarium1 = Aquarium()
        aquarium1.printSize()
        // default height and length
        val aquarium2 = Aquarium(width = 25)
        aquarium2.printSize()
        // default width
        val aquarium3 = Aquarium(height = 40, length = 25)
        aquarium3.printSize()
        // everything custom
        val aquarium4 = Aquarium(width = 25, height = 40, length = 25)
        aquarium4.printSize()
        val aquarium6 = Aquarium(numberOfFish = 29)
        aquarium6.printSize()
        aquarium6.volume = 70
        aquarium6.printSize()
        println("Volume: ${aquarium6.width * aquarium6.length * aquarium6.height / 1000} liters")

         */
        val myAquarium = Aquarium(width = 25, length = 25, height = 40)
        myAquarium.printSize()
        val myTower = TowerTank(diameter = 25, height = 40)
        myTower.printSize()
    }

    constructor(numberOfFish: Int) : this() {
        // 2,000 cm^3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }

   // var volume: Int
     //   get() = width * height * length / 1000  // 1000 cm^3 = 1 liter
       // set(value) {
         //   height = (value * 1000) / (width * length)
        //}
}
class TowerTank (override var height: Int, var diameter: Int): Aquarium(height = height, width = diameter, length = diameter) {
    override var volume: Int
        // ellipse area = π * r1 * r2
        get() = (width/2 * length/2 * height / 1000 * PI).toInt()
        set(value) {
            height = ((value * 1000 / PI) / (width/2 * length/2)).toInt()

        }
    override var water = volume * 0.8
    override val shape = "cylinder"
}

abstract class AquariumFish {
    abstract val color: String
}
class Shark: AquariumFish(), Aquarium.FishAction {
    override val color = "grey"
    override fun eat() {
        println("hunt and eat fish")
    }
}
interface FishAction {
    fun eat()
}
interface FishColor {
    val color: String
}



object GoldColor : FishColor {
    override val color = "gold"
}
class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}
class Plecostomus (fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction("eat algae"),
    FishColor by GoldColor{
        override fun eat (){
            println("hahahahahaha")

        }    }
data class Decoration(val rocks: String, val wood: String, val diver: String) {
    enum class Color(val rgb: Int) {
        RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF);
    }
    enum class Direction(val degrees: Int) {
        NORTH(0), SOUTH(180), EAST(90), WEST(270)
    }

    fun main() {

    }
}
class Choice {
    companion object {
        var name: String = "lyric"
        fun showDescription(name:String) = println("My favorite $name")
    }

}
object Constants {
    const val CONSTANT2 = "object constant"

}
fun String.hasSpaces(): Boolean {
    val found = this.indexOf(' ')
    // also valid: this.indexOf(" ")
    // returns positive number index in String or -1 if not found
    return found != -1

}
open class AquariumPlant(val color: String, private val size: Int){}

class GreenLeafyPlant(size: Int) : AquariumPlant("green", size)

fun AquariumPlant.print() = println("AquariumPlant")
fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

fun AquariumPlant?.pull() {
    this?.apply {
        println("removing $this")
    }
}

    fun main(args: Array<String>) {
        //println(Decoration.Direction.EAST.name)
        //println(Decoration.Direction.EAST.ordinal)
        // println(Decoration.Direction.EAST.degrees)
        //val aquarium = Aquarium()
        //aquarium.buildAquarium()
        // println(Choice.name)
        //Choice.showDescription("pick")
        //Choice.showDescription("selection")
        val equipment = "fish net" to "catching fish"
        //println("${equipment.first} used for ${equipment.second}")
        val numbers = Triple(6, 9, 42)
        //println(numbers.toString())
        //println(numbers.toList())
        val equipment2 = ("fish net" to "catching fish") to "equipment"
        //println("${equipment2.first} is ${equipment2.second}\n")
        // println("${equipment2.first.second}")
        // val equipment = "fish net" to "catching fish"
        val (tool, use) = equipment
        //println("$tool is used for $use")
        //val numbers = Triple(6, 9, 42)
        //  val (n1, n2, n3) = numbers
        // println("$n1 $n2 $n3")
        //val list = listOf(1, 5, 3, 4)
        //println(list.sum())
        val list2 = listOf("a", "bbb", "cc")
        // println(list2.sumBy{ it.length })
        // val list2 = listOf("a", "bbb", "cc")
        // for (s in list2.listIterator()) {
        val scientific =
            hashMapOf("guppy" to "poecilia reticulata", "catfish" to "corydoras", "zebra fish" to "danio rerio")

        // println("$s ")
        //println(scientific.get("guppy"))
        //println(scientific.get("zebra fish"))
        // println(scientific.getOrDefault("swordtail", "sorry, I don't know"))

        val foo = Constants.CONSTANT2
        //val plant = GreenLeafyPlant(size = 10)
        // plant.print()
        //println("\n")
        //val aquariumPlant: AquariumPlant = plant
        //aquariumPlant.print()  // what will it print?
        val plant: AquariumPlant? = null
        plant.pull()
    }



