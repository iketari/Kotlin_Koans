data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override operator fun compareTo(anotherDate: MyDate): Int {
        if (this.year != anotherDate.year) return this.year - anotherDate.year
        if (this.month != anotherDate.month) return this.month - anotherDate.month
        if (this.dayOfMonth != anotherDate.month) return  this.dayOfMonth - anotherDate.month

        return 0
    }
}

fun compare(date1: MyDate, date2: MyDate) = date1 < date2
