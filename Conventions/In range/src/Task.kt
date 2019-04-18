class DateRange (override val start: MyDate, override val endInclusive: MyDate) : ClosedRange<MyDate> {
    override fun contains(d: MyDate): Boolean {
        return d >= start && d <= endInclusive;
    }
}

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in DateRange(first, last)
}
