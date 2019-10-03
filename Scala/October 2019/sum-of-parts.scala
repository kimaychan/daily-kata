/*
  Let us consider this example (array written in general format):

  ls = [0, 1, 3, 6, 10]

  Its following parts:

  ls = [0, 1, 3, 6, 10]
  ls = [1, 3, 6, 10]
  ls = [3, 6, 10]
  ls = [6, 10]
  ls = [10]
  ls = []
  
  The corresponding sums are (put together in a list): [20, 20, 19, 16, 10, 0]

  The function parts_sums (or its variants in other languages) will take as parameter a 
  list ls and return a list of the sums of its parts as defined above.
*/

object Kata {

  def partsSums(l: List[Int]): List[Int] = 
    l.reverse.foldLeft(List(0))((r, v) => (v + r.head) +: r)
}

//10-03-19