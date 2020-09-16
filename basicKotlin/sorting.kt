fun swap(arrayEx: MutableList<Int> = mutableListOf()) {

  var x: Int
  var y: Int
  var totalSwap: Int = 0
  var i: Int = 0

  while (i < arrayEx.size - 1) {
    if (arrayEx[i] > arrayEx[i + 1]) {
      x = arrayEx[i]
      y = arrayEx[i + 1]
      x = y.also { y = x}
      arrayEx[i] = x
      arrayEx[i + 1] = y
      totalSwap += 1
      println("$totalSwap. [$x, $y] -> ${arrayEx.joinToString().replace(",","")}")
      i = 0
    } else {
      i++
    }
  }

  println("\nJumlah Swap: $totalSwap")
}

fun main() {
  var arrayEx = mutableListOf<Int>(4,9,7,5,8,9,3)
  
  swap(arrayEx)
}
