package com.coursera.learning

object Misc {
  def sum(f: Int => Int)(a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a + 1, f(a) + acc)
    }

    loop(a, 0)
  }

  def main(args: Array[String]): Unit = {
    println(sum(x => x)(1, 5))
    println(product(x => x)(1, 4))
    println(fact(4))
  }

  def product(f: Int => Int)(a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a + 1, f(a) * acc)
    }

    loop(a, 1)
  }

  def fact(n: Int): Int = {
    product(x => x)(1, n)
  }

  // TODO Write a function that generalizes sum and product
}
