package strategyPattern.diskReadExample

import kotlin.math.abs

class SRFStrategy(
    private val diskHead: DiskHead
) : DiskReadStrategy {

    private val currentPosition: Int
        get() = diskHead.currentPosition

    override fun read(readList: List<Int>) {
        val alreadyReadList = mutableListOf<Int>()
        var shortestIndex: Int

        repeat(readList.size) {
            shortestIndex = getShortestIndex(readList, alreadyReadList)

            if (shortestIndex != Int.MAX_VALUE) {
                diskHead.moveTo(shortestIndex)
                diskHead.read()
                alreadyReadList.add(shortestIndex)
            }
        }

    }

    private fun getShortestIndex(readList: List<Int>, alreadyReadList: List<Int>): Int {

        var shortestIndex = Int.MAX_VALUE
        readList.forEach {

            val distance = abs(currentPosition - it)
            if (shortestIndex >= distance && alreadyReadList.contains(it).not()) {
                shortestIndex = it
            }

        }

        return shortestIndex
    }

}