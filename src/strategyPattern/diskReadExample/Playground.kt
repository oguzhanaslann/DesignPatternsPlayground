package strategyPattern.diskReadExample

fun main() {
    val disk = Disk(
        listOf("a","b","c","d","e")
    )

    disk.readListedData(
        listOf(1,3)
    )

    disk.diskReadStrategy = SRFStrategy(disk.diskHead)
    disk.moveDiskHeadTo(3)

    disk.readListedData(listOf(1,4))
}