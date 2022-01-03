object Main extends App{
var ninety = new NinetyNineProblems
  val lastNine = ninety.lastElementOfAList(List(1,3,56,7,4,6))
  val kthNine = ninety.KthElement(3,List(1,3,56,7,4,6))
  val lengthNine = ninety.lengthOfList(List(1,3,56,7,4,6))
  val reverseNine = ninety.reverseList(List(1,3,56,7,4,6))
  println(s"last element ${lastNine}")
  println(s"kth element ${kthNine}")
  println(s"lenght list ${lengthNine}")
  println(s"reverse List ${reverseNine}")
}
