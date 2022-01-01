package strategyPattern.diskReadExample

class Disk(
    val diskData: List<String>
) {

    val diskHead: DiskHead = DiskHead((diskData.size-1) /2 , this)
    var diskReadStrategy: DiskReadStrategy = FCFSStrategy(diskHead)

     fun readListedData(readList: List<Int>) {
        diskReadStrategy.read(readList)
    }

    fun readListedData(readList: List<Int>, strategy: DiskReadStrategy) {
        strategy.read(readList)
    }


    fun moveDiskHeadTo(index : Int ) {
        diskHead.currentPosition = index
    }
}