object hw1 extends eecs.cs478 {
  def userName = "DekuZero (Conner Russell)"

  def sumArray(a: Array[Int]): Int = {
    var numSum = 0
    for (i <- 0 until a.length) {
      numSum += a(i)
    }
    return numSum
  }
  test("sumArray", sumArray _, "a")

  def sumList(list: List[Int]): Int = {
    var numSum = 0
    var nlist = list
    while (!nlist.isEmpty) {
      numSum += nlist.head
      nlist = nlist.tail
    }
    return numSum
  }
  test("sumList", sumList _, "list")
}
