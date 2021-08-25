class ProblemB {

    fun main() {
        var entryAmount: Int = readln().toInt()
      

        while (entryAmount-- > 0) {
            var ansStr = ""
            val (strSize, letterNum) = readLine()!!.trim().split("\\s+".toRegex()).map(String::toInt)

            for (i in 0 until strSize) {
                ansStr += ('a' + i % letterNum)
            }
            println(ansStr)
           
        }
       
    }

}
