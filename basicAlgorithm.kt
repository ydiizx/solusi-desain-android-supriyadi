fun multiplicationTable(n: Int): List<List<Int>>{

  var arrayResult: MutableList<List<Int>> = mutableListOf()
  var k: Int = 1

  for (i in k..n) {
    var nestedArray: MutableList<Int> = mutableListOf<Int>()    
    for (j in k..i*n) {
      println(j)
      nestedArray.add(j)
    }

    arrayResult.add(nestedArray)
    k += n
  } 

  return arrayResult;
}

fun main(args: Array<String>) {

  println(multiplicationTable(3))
}
