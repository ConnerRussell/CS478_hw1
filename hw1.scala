object hw1 extends eecs.cs478 {
  def userName = "DekuZero"

  def sumArray(a: Array[Int]): Int = {
    var numSum = 0
    for (n <- a.length){
      numSum += n
    }
  }
  test("sumArray", sumArray _, "a")

  def sumList(list: List[Int]): Int = {
    var numSum = 0
    while (list.isNotEmpty){
      numSum += list.head
      list = list.tail
    }
  }
  test("sumList", sumList _, "list")
}
