import kotlin.math.log10
import kotlin.math.pow

object ArmstrongNumber {

    fun check(input: Int): Boolean {

        return "$input".map { "$it".toInt().pow("$input".length) }.sum() == input
    }

}

private fun Int.pow(x: Int): Int {

    return this.toDouble().pow(x).toInt()
}
