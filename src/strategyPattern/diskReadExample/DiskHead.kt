package strategyPattern.diskReadExample

import kotlin.math.abs

class DiskHead(
    currentPosition: Int,
    val disk: Disk
) {

    var currentPosition = currentPosition
       set(value) {
           println("head moves from $field to $value , distance ${abs(field - value )}")
           field = value
       }

    fun moveTo(it: Int) {
        currentPosition = it
    }

    fun read() {
        println("disk head reads ${ disk.diskData[currentPosition] } at $currentPosition of the disk")
    }
}