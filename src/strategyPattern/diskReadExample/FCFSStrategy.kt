package strategyPattern.diskReadExample

class FCFSStrategy(
    val diskHead: DiskHead
) : DiskReadStrategy {

    override fun read(readList : List<Int>,) {
        readList.forEach {
            diskHead.moveTo(it)
            diskHead.read()
        }
    }

}
