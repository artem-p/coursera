package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
    * Exercise 1
    */
  def pascal(c: Int, r: Int): Int =
    if (c==0 || c==r) 1
    else pascal(c - 1, r - 1) + pascal( c, r -1)

  /**
    * Exercise 2
    */
  def balance(chars: List[Char]): Boolean = {
    def only_parentheses(chars: List[Char]): List[Char] =
      chars.filter(is_parentheses)

    def is_parentheses(c: Char): Boolean =
      if (c == '(' || c == ')') true else false

    def count_pars(pars: List[Char]): Int =
    // returns +1 when first par is "(" and -1 when ")"
      if (pars.nonEmpty)
        if (pars.head == '(') 1
        else -1
      else 0

    def is_balanced(pars: List[Char], numOpen: Int): Boolean =
      if (pars.isEmpty)
        if (numOpen == 0) true else false
      else {
        val nowOpen = numOpen + count_pars(pars)
        is_balanced(pars.tail, nowOpen)
      }


    is_balanced(only_parentheses(chars), 0)
  }

  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
