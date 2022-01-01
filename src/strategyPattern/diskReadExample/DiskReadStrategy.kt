package strategyPattern.diskReadExample

interface DiskReadStrategy {
    fun read(readList : List<Int>,)
}