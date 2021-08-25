class ProblemA {

    fun main() {

        var entryAmount: Int = readInt() // 1 <= количество запросов <= 1000
        val outputArray = ArrayList<Long>()

        while (entryAmount-- > 0) {
            val (evenJumpInc, oddJumpInc, jumpAmount) = readLine()!!.trim().split("\\s+".toRegex()).map(String::toLong)
            val xCoordinate: Long = (evenJumpInc - oddJumpInc) * (jumpAmount / 2) + (jumpAmount % 2) * evenJumpInc
            println(xCoordinate)
        }
       
    }

}
