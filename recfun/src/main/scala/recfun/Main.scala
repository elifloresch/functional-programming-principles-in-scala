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
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
    * Exercise 2
    */
  def balance(chars: List[Char]): Boolean = {
    def isOpeningParenthesis(c: Char): Boolean = '(' == c

    def isClosingParenthesis(c: Char): Boolean = ')' == c

    def balanceIter(c: Char, chars: List[Char], n: Int): Int = {
      if (chars.isEmpty)
        if (isClosingParenthesis(c)) n - 1 else n
      else if (isOpeningParenthesis(c))
        balanceIter(chars.head, chars.tail, n + 1)
      else if (isClosingParenthesis(c))
        balanceIter(chars.head, chars.tail, n - 1)
      else balanceIter(chars.head, chars.tail, n)
    }

    if (chars.isEmpty) true
    else balanceIter(chars.head, chars.tail, 0) == 0
  }

  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int = {
    if (money < 0)
      0
    else if (coins.isEmpty)
      if (money == 0) 1 else 0
    else
      countChange(money - coins.head, coins) + countChange(money, coins.tail)
  }
}
