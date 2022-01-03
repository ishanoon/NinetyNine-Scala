class NinetyNineProblems {
  /**
   * S-99: Ninety-Nine Scala Problems
   */

  //P01 (*) Find the last element of a list.

  def lastElementOfAList(myList : List[Int]) : Int = myList.last

  //P02 (*) Find the last but one element of a list.
//  def latButOneElementOfList(myList : List[Int]) : Int = myList[]

  //P03 (*) Find the Kth element of a list
  def KthElement(k : Int,myList : List[Int]): Int = myList(k)

  //P04 (*) Find the number of elements of a list.
  def lengthOfList(myList : List[Int]): Int = myList.size

  //P05 (*) Reverse a list.
  def reverseList (myList : List[Int]) : List[Int] = myList.reverse

}
