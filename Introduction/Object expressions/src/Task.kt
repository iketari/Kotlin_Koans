import java.util.*
import kotlin.Comparator

fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, object: Comparator<Int> {
        override fun compare (i1: Int, i2: Int): Int {
            return i2 - i1
        }
    })
    return arrayList
}
